package com.assignment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String chkbox = request.getParameter("chk");
		
		
		//login check		
		if(id!=null && pw!=null && id.equals("asdf") && pw.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			//CheckBox Cookie			
			if(chkbox != null) {
				//cookie 를 구워준다.				
				Cookie cookie = new Cookie("id", id);
				cookie.setMaxAge(30);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			response.sendRedirect("/synopsis.jsp");
			
		}else {
			response.sendRedirect("/loginForm.jsp?msg=id and password do not match");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
