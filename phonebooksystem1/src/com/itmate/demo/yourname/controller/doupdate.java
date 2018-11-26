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
 * Servlet implementation class doupdate
 */
@WebServlet("/doupdate")
public class doupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doupdate() {
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
		String id= request.getParameter("id");
		String username=request.getParameter("username");
		String phone=request.getParameter("phone");
		String age=request.getParameter("age");
		PhoneUser pu=new PhoneUser(username,phone, age);
		pu.setId(Integer.parseInt(id));
		pu.setUsername(username);
		pu.setPhone(phone);
		pu.setAge(age);
		PhoneUserService p=new PhoneUserService();
		int i = p.updatephoneuser(pu);
		if(i>0){
			request.setAttribute("msg","修改成功");
			
		}else{
			request.setAttribute("msg", "修改失败");
			
		}
		request.getRequestDispatcher("/toalluser").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
