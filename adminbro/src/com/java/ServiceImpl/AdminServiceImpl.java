package com.java.ServiceImpl;

import com.java.dao.AdminDao;
import com.java.daoImpl.AdminDaoImpl;
import com.java.model.Question;
import com.java.service.AdminService;

public class AdminServiceImpl implements AdminService{

	@Override
	public boolean insertQuestion(Question question) {
		// TODO Auto-generated method stub
		AdminDao ado=new AdminDaoImpl();
		return ado.insert(question);
		
	}

	@Override
	public boolean deleteQuestion(String questionid) {
		// TODO Auto-generated method stub
		
		return false;
	}

}