package com.thinkitive;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

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
public class StudentController {
	private static int num =0;
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	List<QuestionBank> qlist;
	int maxsize=0;
	Answersheet answersheet;
	
	
	public StudentController() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		answersheet= new Answersheet();

		
	}
	
	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		StudentController.num = num;
	}

	@GetMapping("/score")
	public ModelAndView scoregenerator()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("message", "24");
		model.setViewName("student.jsp");
		return model;
	}
	
	@PostMapping("/exam")
	public ModelAndView exam( @RequestBody User student, @RequestParam (name="id") Integer id) 
	{
		student.setDesignation("student");
		student.setId(id);
		System.out.println(student.toString());
		setNum(0);
		Query query = session.createQuery("From QuestionBank");
		qlist = query.list();
	
		maxsize = qlist.size();
		String data = qlist.get(num).toString();
		
		answersheet.setStduent(student);
		ModelAndView model = new ModelAndView();
		model.addObject("message", data);
		model.setViewName("Exampage.jsp");
		return model;
		
	}
	@PostMapping("/forward")
	public ModelAndView next(@RequestParam (name ="answer")String answer) 
	{
		ModelAndView model = new ModelAndView();
		if(answer != null) {
			(answersheet.getAnswers()).put(getNum(), answer);}
		if(getNum()<(maxsize)-1) 
		{ 
			System.err.println(getNum());
		
		String data = qlist.get(num+1).toString();
		model.addObject("message", data);
		System.out.println(getNum()+1);
        setNum(getNum()+1);
        }
		model.setViewName("Exampage.jsp");
	
	
	return model;
		
	}
	@PostMapping("/backward")
	public ModelAndView previous(@RequestParam (name ="answer") String answer) 
	{
		ModelAndView model = new ModelAndView();
		if(answer !=null) {
			(answersheet.getAnswers()).put(getNum(), answer);}
		if(getNum() >0) {
			
		String data = qlist.get(getNum()-1).toString();
		System.out.println(getNum()-1);
        setNum(getNum()-1); 
    	model.addObject("message", data);
		}
	
		model.setViewName("Exampage.jsp");
		return model;		
	}
	@PostMapping("/submit")
	public String submit() 
	{
		int count =0;
		session = factory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("From QuestionBank");
		qlist = query.list();
		
		for (Entry<Integer, String> mapElement : answersheet.getAnswers().entrySet()) { 
		if(qlist.get(mapElement.getKey()).getAnswer().equals(mapElement.getValue()))
				{
			     count++;
				}
		}
		System.err.println(count);
		User student= answersheet.getStduent();
		student.setScore(count);
		System.out.println(answersheet.getAnswers().toString());
		session.update(student);
		tx.commit();
		
		return "submitted";
	}
	
}
