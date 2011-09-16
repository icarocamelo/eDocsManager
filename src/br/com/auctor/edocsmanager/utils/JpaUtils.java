package br.com.auctor.edocsmanager.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaUtils {

	private static EntityManager em;
	private static EntityManagerFactory factory;

	public static EntityTransaction getTransaction() {
		return em.getTransaction();
	}
	
	public static EntityManager getEmf() throws Throwable {
		if (factory == null) {	
			factory = Persistence
					.createEntityManagerFactory("org.hibernate.persistence.eDocsManager");
		}
		em = factory.createEntityManager();
		
		return em;
	}
}
