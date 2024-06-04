package com.blogs.service;

import java.util.List;

import com.blogs.dao.BlogDao;

import com.blogs.entity.Blog;


public class BlogService {
	BlogDao dao =new BlogDao();
	public void saveBlog(Blog b) {
		dao.saveBlog(b);
	}
	
	public  List<Blog> getListOfBlogs() {
		
		List<Blog> blogs=dao.getBlog();
		return blogs;
	
	}
	public void deleteBlog(int id) {
		dao.deleteBlog(id);
	}
	
	public void updateblog(int id, String  title, String des) {
		dao.updateBlog(id, title, des);
	}
}
	
	


