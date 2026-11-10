package q3;

public class Calda extends ComplementoDecorator {
    private double preco;

    public Calda(Bebida bebida) {
        super(bebida);
        this.preco = 2.50;
    }

    public Calda(Bebida bebida, double preco) {
        super(bebida);
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Calda";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + preco;
    }
}
