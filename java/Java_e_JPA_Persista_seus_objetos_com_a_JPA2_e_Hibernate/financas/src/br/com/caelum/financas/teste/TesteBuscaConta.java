package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		
		JPAUtil jpa = new JPAUtil();

		EntityManager em = jpa.getTransaction();
		
		List<Conta> lista =  em.createQuery("from Conta").getResultList();
//		em.remove(lista.get(0));
		
		jpa.transactionCommit();
		jpa.entityManagerClose();
	}
}
