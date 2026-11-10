package q3;

public class Cha implements Bebida {
    private double preco;

    public Cha() {
        this.preco = 4.00;
    }

    public Cha(double preco) {
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return "Chá";
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
