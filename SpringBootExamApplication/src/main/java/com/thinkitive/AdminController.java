package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class AdminController {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;

	public AdminController() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();

	}
	
	/*
	 * @PostMapping("/add") public String check(String username , String password) {
	 * session = factory.openSession(); tx = session.beginTransaction(); Admin a =
	 * new Admin(username, password); session.save(a); tx.commit(); session.close();
	 * 
	 * return "Success";
	 * 
	 * }
	 */

	@GetMapping("/adminlogin")
	public ModelAndView checkcred( @RequestBody Admin admin) {
		//Admin a = new Admin(username, password);
		session = factory.openSession();
		tx = session.beginTransaction();
		Criteria c = session.createCriteria(Admin.class);
		c.add(Restrictions.ilike("uname",admin.getUname()));
		c.add(Restrictions.ilike("upass", admin.getUpass()));
		List l = c.list();

		ModelAndView model = new ModelAndView();
		if (l.size() != 0) {
			model.setViewName("Administrator.jsp");
		} else {
			model.setViewName("login.jsp");
		}

		return model;

	}

	@GetMapping("/userlogin")
	public ModelAndView checkucred(@RequestBody User user) {
		session = factory.openSession();
		tx = session.beginTransaction();
		//User a = new User(username, password, designation);
		Criteria c = session.createCriteria(User.class);
		c.add(Restrictions.ilike("uname", user.getUname()));
		c.add(Restrictions.ilike("upass", user.getUpass()));
		c.add(Restrictions.ilike("designation", user.getDesignation()));
		List l = c.list();

		ModelAndView model = new ModelAndView();
		if (l.size() != 0) {
			
			if(user.getDesignation().equals("student"))
			{
				model.setViewName("student.jsp");
			}
			else if(user.getDesignation().equals("teacher")) 
			{
				model.setViewName("teacher.jsp");
			}
			
		} else {
			model.setViewName("login.jsp");
		}

		return model;
	}

	@PostMapping("/other")
	public ModelAndView adminoperation(@RequestBody User user, @RequestParam(name="profile") String profile, @RequestParam(name="options") String options,@RequestParam(name="qno") String qno, @RequestParam(name="id") String id) {
		ModelAndView model = new ModelAndView();
		session = factory.openSession();
		tx = session.beginTransaction();

		if (profile.equals("None") && options.equals("None")) {
			if(user.getDesignation() == "student") 
			{
				user.setScore(0);
			}
			session.save(user);
			model.addObject("message", "Added Successfully");
		}

		// Student
		if (profile.equals("student")) {

			if (options.equals("update")) {
				
				user.setId(Integer.parseInt(id));
				session.update(user);
			}

			if (options.equals("delete")) {

				
				user.setId(Integer.parseInt(id));
				session.delete(user);
			}
			if (options.equals("getone")) {
				String data = session.get(User.class, Integer.parseInt(id)).toString();
				model.addObject("message", data);
			}
			if (options.equals("getall"))

			{

				Criteria c = session.createCriteria(User.class);

				c.add(Restrictions.ilike("designation", profile));
				List l = c.list();
				model.addObject("message", l.toString());

			}

		}

		// Teacher
		if (profile.equals("teacher")) {

			if (options.equals("update")) {

				
				user.setId(Integer.parseInt(id));
				session.update(user);

				model.addObject("message", "updated successfully");
			}
			if (options.equals("delete")) {

				
				user.setId(Integer.parseInt(id));
				session.delete(user);

				model.addObject("message", "deleted successfully");
			}
			if (options.equals("getone")) {

				String data = session.get(User.class, Integer.parseInt(id)).toString();

				System.out.println(data);
				model.addObject("message", data);

			}

			if (options.equals("getall")) {

				Criteria c = session.createCriteria(User.class);

				c.add(Restrictions.ilike("designation", profile));
				List l = c.list();
				model.addObject("message", l.toString());

			}
		}

		// Questions
		if (profile.equals("questions")) {
			if (options.equals("update")) {
			}
			if (options.equals("delete")) {
			}
			if (options.equals("getone")) {
			}
			if (options.equals("getall")) {
			}
		}

		tx.commit();
		session.close();

		model.setViewName("Administrator.jsp");
		return model;
	}

}
