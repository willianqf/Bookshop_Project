package br.com.livmoderna.entidades;

public class Livro {
	private String titulo;
	private Autor autor;
	private String editora;
	private String anoPublicacao;
	private double valor;
	private int numeroPaginas;
	private String edicao;

	// Construtor de C�pia
	public Livro(Livro liv) {
		this.autor = new Autor(liv.autor);
		this.titulo = liv.titulo;
		this.edicao = liv.edicao;
		this.anoPublicacao = liv.anoPublicacao;
		this.valor = liv.valor;
		this.numeroPaginas = liv.numeroPaginas;
	}
	
	// Construtor com Par�metros
	public Livro(String titulo, Autor autor, String editora, String anoPublicacao, 
			double valor, int numeroPaginas, String edicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.valor = valor;
		this.numeroPaginas = numeroPaginas;
		this.edicao = edicao;
	}

	// Construtor padr�o (default)
	public Livro() {
		this.titulo = "Java como programar";
		this.autor = new Autor("Deitel","deitel@deitel.com");
		this.editora = "Pearson";
		this.anoPublicacao = "1996";
		this.valor = 55.00;
		this.numeroPaginas = 800;
		this.edicao = "1a edicao";
	}

	// M�todo acessor
	public String getTitulo() {
		return titulo;
	}

	// M�todo modificador
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getDataPublicacao() {
		return anoPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.anoPublicacao = dataPublicacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	// M�todo sobrescrito da classe Object para compara��o de objetos. 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro livro = (Livro) obj;
		return this.anoPublicacao.equals(livro.anoPublicacao) && this.autor.equals(livro.autor)
				&& this.edicao.equals(livro.edicao) && this.editora.equals(livro.editora)
				&& numeroPaginas == livro.numeroPaginas && this.titulo.equals(livro.titulo)
				&& this.valor == livro.valor;
	}
}