package com.thinkitive;

import java.util.HashMap;

public class Answersheet {
private User stduent;
private HashMap<Integer, String> answers = new HashMap<>();


public Answersheet() {
answers.put(0, "0");	
}
public Answersheet(User stduent, HashMap<Integer, String> answers) {
	super();
	this.stduent = stduent;
	this.answers = answers;
}
public User getStduent() {
	return stduent;
}
public void setStduent(User stduent) {
	this.stduent = stduent;
}
public HashMap<Integer, String> getAnswers() {
	return answers;
}
public void setAnswers(HashMap<Integer, String> answers) {
	this.answers = answers;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((stduent == null) ? 0 : stduent.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Answersheet other = (Answersheet) obj;
	if (stduent == null) {
		if (other.stduent != null)
			return false;
	} else if (!stduent.equals(other.stduent))
		return false;
	return true;
}
@Override
public String toString() {
	return "Asnwersheet [stduent=" + stduent + ", answers=" + answers + "]";
}



}
