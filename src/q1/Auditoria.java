package q1;

public class Auditoria implements AreaInteressada {
    @Override
    public void atualizar(Produto produto, int quantidadeAnterior, int novaQuantidade) {
        System.out.println("[Auditoria] Registro: Estoque do produto \"" + produto.getNome()
                + "\" alterado de " + quantidadeAnterior + " para " + novaQuantidade + ".");
    }
}
