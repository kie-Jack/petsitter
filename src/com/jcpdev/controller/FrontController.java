package com.jcpdev.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jcpdev.controller.action.Action;
import com.jcpdev.controller.action.ActionForward;
import com.jcpdev.controller.action.PetProfileListAction;
import com.jcpdev.controller.action.ProfileInsertAction;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ActionForward forward=null; 
		String spath = request.getServletPath();
		String path="index.jsp";
		String url ="./";   
		
		if(spath.equals("/pet.do")) {
			Action action = new PetProfileListAction();
			forward = action.execute(request, response);      //여기에 들어갈 코드가 많습니다.-> Action 구현 클래스로 변경.
			forward.setUrl("petlist.jsp");
			
		}else if(spath.equals("/insert.do")) {
			Action action = new ProfileInsertAction();
			forward = action.execute(request, response);
//			url = "list.do";
//			forward.setUrl(url);
		}
		
		//이 시점에서 forward 에 isRedirect 와 url 값이 저장되었으면 ok!
		if(forward.isRedirect()) {   
			response.sendRedirect(forward.getUrl());
		}else {
			RequestDispatcher rd 
			= request.getRequestDispatcher(forward.getUrl());
			rd.forward(request, response);
		}
		
	}

}