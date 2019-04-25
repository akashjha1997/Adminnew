package com.java.service;

import com.java.model.Question;

public interface AdminService {
	public boolean insertQuestion(Question question);
	public boolean deleteQuestion(String questionid);
}
