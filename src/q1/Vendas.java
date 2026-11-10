package q1;

public class Vendas implements AreaInteressada {
    @Override
    public void atualizar(Produto produto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("[Vendas] ALERTA: O produto \"" + produto.getNome()
                    + "\" voltou a ter estoque (quantidade atual: " + novaQuantidade + ")! Vendas liberadas.");
        }
    }
}
