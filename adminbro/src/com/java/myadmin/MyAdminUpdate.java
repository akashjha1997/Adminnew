package com.java.myadmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.AdminDao;
import com.java.daoImpl.AdminDaoImpl;

@WebServlet("/MyAdminUpdate")
public class MyAdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyAdminUpdate() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out=response.getWriter();
		AdminDao adao=new AdminDaoImpl();
		
		//	boolean flag=true;
			
					
		String m_question_id=request.getParameter("qid");
		String m_question_creator=request.getParameter("Question_creator");
		String m_question=request.getParameter("question");
		String m_choice1=request.getParameter("choice1");
		String m_choice2=request.getParameter("choice2");
		String m_choice3=request.getParameter("choice3");
		String m_choice4=request.getParameter("choice4");
	
		String m_selection=request.getParameter("Selection");
		String m_skillset=request.getParameter("skill");
		String m_competencylevel=request.getParameter("competencylevel");
		int m_marks=Integer.parseInt(request.getParameter("Mark"));
		String m_answer=request.getParameter("Answer");
		
		
		com.java.model.Question rModel=new com.java.model.Question(m_question_id,m_question_creator,m_question,m_choice1,m_choice2,m_choice3,m_choice4,m_selection,m_skillset,m_competencylevel,m_marks,m_answer);
		if(adao.updateQuestion(rModel))
		{
			
			System.out.println(m_question_id);
			System.out.println(m_question_creator);
			System.out.println(m_question);
			System.out.println(m_choice1);
			System.out.println(m_choice2);
			System.out.println(m_choice3);
			System.out.println(m_choice4);
			System.out.println(m_selection);
			System.out.println(m_skillset);
			System.out.println(m_competencylevel);
			System.out.println(m_marks);
			System.out.println(m_answer);
     out.println("Question updated sucessfully");
	System.out.println("Question updated sucessfully");
}
else{
	System.out.println("Question not updated id "+m_question_id);
	out.println("Question not updated with this id "+m_question_id);
}
		
		
	}

}
