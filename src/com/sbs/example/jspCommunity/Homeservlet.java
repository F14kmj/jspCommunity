package com.sbs.example.jspCommunity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet("/Homeservlet")
public class Homeservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("<meta charset=\"UTF-8\" />");
		
		// 입력된 데이터의 무자셋은 UTF-8이다
		request.setCharacterEncoding("UTF-8");
		//출력될 무서는 UTF-8 이다
		response.setContentType("text/html; charset=UTF-8");
		
		String lang = request.getParameter("lang");
		int count = request.getParameter("count") != null ? Integer.parseInt(request.getParameter("count")) : 1;	
		
		if (lang == null) {
			lang = "영어";
		}
		
		response.getWriter().append("<h1>입력된 언어 :" + lang + "</h1>");
		response.getWriter().append("<br>");
		
		String hello = "";
		
		if (lang.equals("한국어")) {
			hello = "안녕하세요.";			
		}
		else if (lang.equals("일본어")) {
			hello = "こんにちは";
		}
		else {
			hello = "Hello";
		}
		
		for (int i = 1 ; i <= count; i++ ) {
			response.getWriter().append(hello + "<br>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
