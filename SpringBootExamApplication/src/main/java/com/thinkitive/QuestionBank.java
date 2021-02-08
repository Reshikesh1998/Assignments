package com.thinkitive;

public class QuestionBank {
	private int qno;
	private String Question;
	private String option_1;
	private String option_2;
	private String option_3;
	private String option_4;
	private String answer;
	public QuestionBank() {
		super();
	}

	public QuestionBank(String question, String option_1, String option_2, String option_3, String option_4,
			String answer) {
		super();
		Question = question;
		this.option_1 = option_1;
		this.option_2 = option_2;
		this.option_3 = option_3;
		this.option_4 = option_4;
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption_1() {
		return option_1;
	}
	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}
	public String getOption_2() {
		return option_2;
	}
	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}
	public String getOption_3() {
		return option_3;
	}
	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}
	public String getOption_4() {
		return option_4;
	}
	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + qno;
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
		QuestionBank other = (QuestionBank) obj;
		if (qno != other.qno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "qno=" + qno + ", Question=" + Question + ", option_1=" + option_1 + ", option_2="
				+ option_2 + ", option_3=" + option_3 + ", option_4=" + option_4;
	}
	
	
	
	

}
