package com.thinkitive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExamOperations {
	
	HashMap<Integer, String> questions = new HashMap<>();
	//teacher
	public void addquestion(String question, int no) 
	{
		questions.put(no, question);
		System.out.println("added successfully");
	}
	
	public void DisplayAll() 
	{
		System.out.println(questions.toString());
	}
	
	public String ModifyQuestions(int no, String question) 
	{
		questions.replace(no, question);
		return "Successfully updated";
	}
	
	public List score() 
	{
		List<Integer> score =new ArrayList<Integer>();
		return score;
	}
	
	
	//sudent
	public int studentscore() 
	{
		int score =0;
		return score;
	}
	
	public HashMap<Integer, String> getquestions()
	{
		return questions;
		
	}
	
	public HashMap<Integer, String> review()
	{
		
		
		return questions;
		
	}
	
	
	

}
