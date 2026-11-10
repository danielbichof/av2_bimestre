package q3;

public class Chantilly extends ComplementoDecorator {
    private double preco;

    public Chantilly(Bebida bebida) {
        super(bebida);
        this.preco = 3.00;
    }

    public Chantilly(Bebida bebida, double preco) {
        super(bebida);
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + preco;
    }
}
