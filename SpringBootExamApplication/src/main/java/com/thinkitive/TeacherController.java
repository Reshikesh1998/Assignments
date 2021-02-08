package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TeacherController {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	List<QuestionBank> qlist;

	public TeacherController() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		
	}
	
	@PostMapping("/teacheroptions")
	public ModelAndView operation(@RequestBody QuestionBank q, @RequestParam(name="profile") String profile, @RequestParam(name="options") String options, @RequestParam(name="qno") Integer qno, @RequestParam(name="id") Integer id) 
	{
		ModelAndView model = new ModelAndView();
		
		if (profile.equals("student")) {

			session = factory.openSession();
			tx = session.beginTransaction();
			
			if (options.equals("getone")) {
				String data = session.get(User.class,id).toString();
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
		if (profile.equals("questions"))
		{
			session = factory.openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("From QuestionBank");
			List<QuestionBank> qlist = query.list();
			
			
			if (options.equals("add")) 
			{
			
				
				
				session.save(q);
				System.out.println("executed");
				model.addObject("message", "Added successfully");
				
			}
			
			if (options.equals("update"))
			{
				
				 QuestionBank question = qlist.get(qno-1);
				 question.setQuestion(q.getQuestion());
				
				 session.update(question);
					model.addObject("message", "updated successfully");
				
			}
			if (options.equals("delete")) {
			
				session.delete(qlist.get(qno-1));
				model.addObject("message", "deleted successfully");
				
			}
			
			if (options.equals("getall")) {
			
			
				model.addObject("message", qlist.toString());
			}
		}
		
		
		tx.commit();
		session.close();

		model.setViewName("teacher.jsp");
		
		
		return model;
	}
	
}
