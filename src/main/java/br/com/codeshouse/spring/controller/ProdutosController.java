package br.com.codeshouse.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codeshouse.spring.DAO.ProdutoDAO;
import br.com.codeshouse.spring.modelo.Produto;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	
	@RequestMapping("/produtos/form")
	public String form(){
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String grava(Produto produto){
		System.out.println("gravando livro " + produto.getTitulo() );
		produtoDAO.gravar(produto);
		return "produtos/ok";
	}
}
