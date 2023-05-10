public class LivroFisico extends Livro{
    
    final private double TAXA_IMPRESSAO = 0.05; // máximo de 5%
    final private double TAXA_DESCONTO = 0.3; // Desconto máximo de 30%

    public double getTAXA_IMPRESSAO() {
        return TAXA_IMPRESSAO;
    } // máximo de 5%

    public LivroFisico(String titulo, Autor autor, String editora, String anoPublicacao, double valor, String edicao, String waterMark, int numeroPaginas)
    {
        super(titulo, autor, editora, anoPublicacao, valor, numeroPaginas, edicao);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem)
    {
        if(porcentagem > TAXA_DESCONTO)
        {
            return false;
        }
        double valor = super.getValor();
        super.setValor(valor - valor * porcentagem);
        return true;
    }

}
