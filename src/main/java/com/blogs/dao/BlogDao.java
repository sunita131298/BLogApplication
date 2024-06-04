package com.blogs.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.blogs.entity.Blog;
import com.blogs.util.HibernateUtil;

public class BlogDao {
	
	public void saveBlog(Blog b) {
		SessionFactory factory =null;
		Session session=null;
		Transaction tx=null;
		
		try {
			factory=HibernateUtil.getSessionFactory();
			session =factory.openSession();
			tx=session.beginTransaction();
			
			session.save(b);
			tx.commit();
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
	}
	
	public List<Blog> getBlog() {
		SessionFactory factory =null;
		Session session=null;
		List<Blog> blog=null;
		
		try {
			factory=HibernateUtil.getSessionFactory();
			session =factory.openSession();
			
			Criteria criteria =session.createCriteria(Blog.class);
			blog=criteria.list();
			
	
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return blog;
	}

	public void deleteBlog(int id) {
		SessionFactory factory =null;
		Session session=null;
		Transaction tx=null;
		
		try {
			factory=HibernateUtil.getSessionFactory();
			session =factory.openSession();
			tx=session.beginTransaction();
			
			Blog b=session.get(Blog.class, id)	;
			session.delete(b);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(session!=null) {
				session.close();
			}
		}
	}
	
	public void updateBlog(int id ,String title,String desc) {
		SessionFactory factory =null;
		Session session=null;
		Transaction tx=null;
		
		try {
			factory=HibernateUtil.getSessionFactory();
			session =factory.openSession();
			tx=session.beginTransaction();
			
			Blog b=session.get(Blog.class, id)	;
			b.setTitle(title);
			b.setDescription(desc);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(session!=null) {
				session.close();
			}
		}
	}

}


