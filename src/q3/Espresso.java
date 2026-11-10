package q3;

public class Espresso implements Bebida {
    private double preco;

    public Espresso() {
        this.preco = 5.00;
    }

    public Espresso(double preco) {
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
