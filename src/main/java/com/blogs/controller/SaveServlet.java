package com.blogs.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blogs.entity.Blog;
import com.blogs.service.BlogService;

public class SaveServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("title");
		String description=req.getParameter("description");
		
		System.out.println(title);
		System.out.println(description);
		
		Blog bb=new Blog(title ,description, new Date());
		
		BlogService ss=new BlogService();
		ss.saveBlog(bb);
		
		resp.sendRedirect("list");
		
		
		
	}

}
