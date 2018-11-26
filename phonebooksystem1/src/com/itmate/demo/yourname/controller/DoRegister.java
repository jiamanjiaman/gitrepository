package com.itmate.demo.yourname.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itmate.demo.yourname.entity.PhoneUser;
import com.itmate.demo.yourname.service.PhoneUserService;

/**
 * Servlet implementation class toregister
 */
@WebServlet("/doregister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PhoneUserService phoneUserService = new PhoneUserService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		String msg = "";
		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		PhoneUser pu = new PhoneUser(username, phone,age);
		if(phoneUserService.isExist(pu)){
			msg = "此账户已存在，请重新输入";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
		}else{
			int count = phoneUserService.addPhoneUser(pu);
			if(count >0){
				msg = "恭喜你注册成功";
			}else{
				msg = "注册失败";
			}
			
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
