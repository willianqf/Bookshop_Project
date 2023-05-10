package br.com.livmoderna.entidades;

public class Autor {
	private String nome;
	private String email;
	
	// Construtor de cópia
	public Autor(Autor au) {
		this.nome = au.nome;
		this.email = au.email;
	}
	 
	public Autor(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
