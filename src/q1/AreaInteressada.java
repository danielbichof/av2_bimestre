package q1;

public interface AreaInteressada {
    void atualizar(Produto produto, int quantidadeAnterior, int novaQuantidade);

    default void update(Produto produto, int quantidadeAnterior, int novaQuantidade) {
        atualizar(produto, quantidadeAnterior, novaQuantidade);
    }
}
