package com.blogs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blogs.entity.Blog;
import com.blogs.service.BlogService;


@WebServlet("/list")
public class BlogListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public 	BlogListServlet() {
    	   super();
       }
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BlogService ss= new BlogService();
		List<Blog> ListOfBlogs =ss.getListOfBlogs();
		System.out.println(ListOfBlogs);
		request.setAttribute("list", ListOfBlogs);
		RequestDispatcher rd= request.getRequestDispatcher("show-blog.jsp");
		rd.forward(request, response);
		
	}

	
}
