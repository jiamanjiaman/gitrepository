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
 * Servlet implementation class touserlist
 */
@WebServlet("/toalluser")
public class toalluser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PhoneUserService phoneUserService = new PhoneUserService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public toalluser() {
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
		List<PhoneUser> puList = phoneUserService.selectAllUser();
		request.setAttribute("pulist", puList);
		request.getRequestDispatcher("WEB-INF/alluser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
