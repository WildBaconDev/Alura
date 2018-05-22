package br.com.caelum.bean;

import javax.faces.bean.ManagedBean;

import br.com.caelum.model.LivroModel;

@ManagedBean
public class LivroBean {

	LivroModel livro = new LivroModel();
	
	public void gravar() {
		System.out.println("Saída -> " + livro.getTitulo() + " " + livro.getIsbn() + " " + livro.getPreco() + " " + livro.getDataLancamento());
	}

	public LivroModel getLivro() {
		return livro;
	}
}