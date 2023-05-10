public abstract class Livro {
    private String titulo;
    private String editora;
    private String anoPublicacao;
    private double valor;
    private int numeroPaginas;
    private String edicao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
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

    public Livro(Livro liv) {
        this.titulo = "Java como programar";
        this.editora = "Pearson";
        this.anoPublicacao = "1996";
        this.valor = liv.valor;
        this.numeroPaginas = liv.numeroPaginas;
    }

    public Livro(String titulo, Autor autor, String editora, String anoPublicacao, double valor, int numeroPaginas,
            String edicao) {
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.valor = valor;
        this.numeroPaginas = numeroPaginas;
        this.edicao = edicao;

    }

    // Aplicar desconto se não maior que 30% para quem herda
    public abstract boolean aplicaDescontoDe(double porcentagem);

    // Método sobrescrito da classe Object para compara��o de objetos.
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
