package com.java.myadmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.ServiceImpl.AdminServiceImpl;
import com.java.dao.AdminDao;
import com.java.daoImpl.AdminDaoImpl;
import com.java.service.AdminService;

@WebServlet("/MyAdminDelete")
public class MyAdminDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyAdminDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//AdminService ads=new AdminServiceImpl();
		String m_question_id=request.getParameter("Question_id");
		System.out.println(m_question_id);
		AdminDao adao=new AdminDaoImpl();
		
	//	boolean flag=true;
		
				if(adao.deleteQuestion(m_question_id))
				{
		//System.out.println(flag);
		   
			out.println("Question deleted sucessfully");
			System.out.println("Question deleted sucessfully");
		}
		else{
			System.out.println("Question not found with this id "+m_question_id);
			out.println("Question not found with this id "+m_question_id);
		}
	}

}
