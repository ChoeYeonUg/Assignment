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
	String pathTmp = "";

	
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
		String chkbox = request.getParameter("remember");
		String msg = "";
		String passQuery = request.getParameter("passQuery");
		
		System.out.println("chkbox : "+chkbox);
		//login check		
		if(id!=null && pw!=null && id.equals("asdf") && pw.equals("1234")) {
			//Session Setting
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			//CheckBox Cookie	
			if(chkbox != null) {
				//Cookie 를 구워준다.				
				Cookie cookie = new Cookie("id", id);
//				System.out.println(cookie);
				cookie.setMaxAge(120);
				response.addCookie(cookie);
				msg = id;
				response.sendRedirect("/loginForm?id="+msg);
			} else {
				Cookie[] cookies = request.getCookies(); // cookies가 null 수 있음에 주의
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals("id")) {
						Cookie cookie = new Cookie("id", id); // 2. 쿠키를 생성
						cookie.setMaxAge(0); // 3. 쿠키의 유효시간을 0으로 변경(쿠키삭제)
						response.addCookie(cookie); // 4. 쿠키를 응답에 포함시킨다.
						break;
					}
				}
			}
			if(passQuery==null)	
				response.sendRedirect("/synopsis.jsp?"+msg);
			else
				response.sendRedirect("/carpeDiem.jsp");
			
			
		}else {
			msg = "/loginForm.jsp";
			
			if(id!=null)
				msg +="?msg=id and password do not match";
			
			System.out.println(msg);
			response.sendRedirect(msg);
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
