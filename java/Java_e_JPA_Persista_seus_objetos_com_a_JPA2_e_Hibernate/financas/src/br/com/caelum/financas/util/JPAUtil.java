package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
	private static EntityManager em;
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public EntityManager getTransaction() {
		em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		return em;
	}
	
	public void transactionCommit() {
		em.getTransaction().commit();
	}
	
	public void entityManagerClose() {
		em.close();
	}
	
	public void entityManagerFactoryClose() {
		emf.close();
	}
}
