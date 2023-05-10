package br.com.livmoderna.aplicacoes;

import br.com.livmoderna.entidades.Autor;
import br.com.livmoderna.entidades.Livro;

public class UsaLivro {

	public static void main(String[] args) {
		Autor a1 = new Autor("Andrew Tannenbaum","andy@amsterdam.nl");
		
		Livro livro = new Livro("Organização de Computadores", a1, "Pearson", "2010",
								125.00, 290, "1.ed");
		
		
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Editora: " + livro.getEditora());
		
		Livro livro2 = new Livro(livro);
		
		System.out.println(livro2.equals(livro));
	 
		
		String st1 = "UEMG";
		String st2 = "UEMG ";
		
		System.out.println(st1.equals(st2));
		
		
		
		System.out.println("Nome do Autor: " + livro.getAutor().getNome());
		System.out.println("Email do Autor: " + livro.getAutor().getEmail());
		
		
		
	

	}

}
