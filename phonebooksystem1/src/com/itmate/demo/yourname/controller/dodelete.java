package com.itmate.demo.yourname.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itmate.demo.yourname.service.PhoneUserService;

/**
 * Servlet implementation class dodelete
 */
@WebServlet("/dodelete")
public class dodelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dodelete() {
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
		String id=request.getParameter("id");
		PhoneUserService p=new PhoneUserService();
		if(id!=null||"".equals(id)){
			int i=Integer.parseInt(id);//强制类型转换
			boolean flag =p.deletebyid(i);//执行操作方法
			if(flag){
				request.setAttribute("msg","删除成功");
			}else{
				request.setAttribute("msg","删除成功");
			}
			
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
