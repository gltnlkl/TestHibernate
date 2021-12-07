package com.gulukal.project.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gulukal.project.entity.PersonEntity;

public class HibernateUtils {
	private static final SessionFactory sessionFactory = sessionFactory();

	// method

	private static SessionFactory sessionFactory() {

		try {

			// instance

			Configuration configuration = new Configuration();

			// entity classlarimizi buraya ekleyeceðiz

			configuration.addAnnotatedClass(PersonEntity.class);
	

			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

			return factory;

		}
		catch (Exception e) {

			e.printStackTrace();

		}

		return null;

	}

	// dis dünyada bununla bu classa erisim saglayabilecek

	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}
}