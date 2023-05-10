public class Ebook extends Livro {
    private String waterMark;
    final private double TAXA_DESCONTO = 0.15;

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public Ebook(String titulo, Autor autor, String editora, String anoPublicacao, double valor, String edicao,
            String waterMark, int numeroPaginas) {
        super(titulo, autor, editora, anoPublicacao, valor, numeroPaginas, edicao);
        this.waterMark = waterMark;

    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > TAXA_DESCONTO) {
            return false;
        }
        double valor = super.getValor();
        super.setValor(valor - valor * porcentagem);
        return true;
    }
}