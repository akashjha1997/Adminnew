package com.java.myadmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.ServiceImpl.AdminServiceImpl;
import com.java.service.AdminService;


@WebServlet("/Myadmin")
public class Myadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myadmin() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		AdminService ads=new AdminServiceImpl();
		String m_question_id=request.getParameter("Question_id");
		String m_question_creator=request.getParameter("Question_creator");
		String m_question=request.getParameter("Question");
		String m_choice1=request.getParameter("Choice1");
		String m_choice2=request.getParameter("Choice2");
		String m_choice3=request.getParameter("Choice3");
		String m_choice4=request.getParameter("Choice4");
	
		String m_selection=request.getParameter("Selection");
		String m_skillset=request.getParameter("SkillSet");
		String m_competencylevel=request.getParameter("CompetencyLevel");
		int m_marks=Integer.parseInt(request.getParameter("Mark"));
		String m_answer=request.getParameter("Answer");
		System.out.println(m_question_id);
		System.out.print(m_selection);
		System.out.println(m_choice1);
		System.out.println(m_choice2);
		System.out.println(m_choice3);
		System.out.println(m_choice4);
		com.java.model.Question rModel=new com.java.model.Question(m_question_id,m_question_creator,m_question,m_choice1,m_choice2,m_choice3,m_choice4,m_selection,m_skillset,m_competencylevel,m_marks,m_answer);
		
		if(ads.insertQuestion(rModel)){

		  out.println("Question Inserted Sucessfully");

		                                             }





		else{
          out.println("Question Not Inserted");

		}
	}

}
