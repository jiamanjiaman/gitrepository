package com.itmate.demo.yourname.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itmate.demo.yourname.entity.PhoneUser;
import com.itmate.demo.yourname.service.PhoneUserService;

/**
 * Servlet implementation class tologin
 */
@WebServlet("/dologin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PhoneUserService phoneUserService=new PhoneUserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//获得 输入的用户名和密码
		String msg="";
		String username =request.getParameter("username");
		String phone=request.getParameter("phone");
		String age=request.getParameter("age");
		//判断输入的用户名和密码是否正确  在数据库中可以查询到
		PhoneUser pu=new PhoneUser(username,phone,age);
		pu.setUsername(username);
		pu.setPhone(phone);
		pu.setAge(age);
		//如果存在则跳转到alluser页面  如果不存在则跳转到登陆页面
		if(phoneUserService.isExist(pu)){
			List<PhoneUser> pulist=phoneUserService.selectAllUser();
			request.setAttribute("pulist", pulist);
			request.getRequestDispatcher("/toalluser").forward(request, response);
		}else{
			msg = "此用户不存在  请重新输入";
			request.setAttribute("msg", msg);
		request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
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
