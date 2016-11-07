package br.com.codeshouse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codeshouse.spring.modelo.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos/form")
	public String form(){
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String grava(Produto produto){
		System.out.println("granvando livro " + produto );
		
		return "produtos/ok";
	}
}
