package com.java.dao;



import com.java.model.Question;


public interface AdminDao {

	

	public boolean insert(Question question);
	   
	
	public boolean deleteQuestion(String questionid);
	
	
	public boolean updateQuestion(Question question);


}
