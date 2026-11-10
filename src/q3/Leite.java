package q3;

public class Leite extends ComplementoDecorator {
    private double preco;

    public Leite(Bebida bebida) {
        super(bebida);
        this.preco = 2.00;
    }

    public Leite(Bebida bebida, double preco) {
        super(bebida);
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + preco;
    }
}
