package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteJPARelacionamento {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// 1745    | 237 - BANCO BRADESCO          | 86759-1 | Paulo Roberto Souza
		conta.setAgencia("1745");
		conta.setBanco("237 - BANCO BRADESCO");
		conta.setNumero("86759-1");
		conta.setTitular("Paulo Roberto Souza");
		conta.setId(2);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Descrição");
		movimentacao.setTipo(TipoMovimentacao.ENTRADA);
		movimentacao.setValor(new BigDecimal("300"));
		
		movimentacao.setConta(conta);

		JPAUtil transaction = new JPAUtil();
		EntityManager em = transaction.getTransaction();

//		em.merge(conta);
//		em.persist(movimentacao);

		transaction.transactionCommit();

	}
}
