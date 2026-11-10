package q1;

public class Compras implements AreaInteressada {
    @Override
    public void atualizar(Produto produto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < 5) {
            System.out.println("[Compras] ALERTA: O produto \"" + produto.getNome()
                    + "\" está com estoque baixo (" + novaQuantidade + " unidades). Reposição necessária!");
        }
    }
}
