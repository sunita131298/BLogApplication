package com.blogs.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory=null;
	
	public static SessionFactory  getSessionFactory() {
		
		Configuration cfg=new Configuration();
		cfg.configure();
	
		factory=cfg.buildSessionFactory();
		
		return factory;
		
	}
	public static void closeFactory() {
		if(factory!=null) {
			factory.close();
		}
	}
	
 
}
