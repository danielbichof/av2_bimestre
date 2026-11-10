package q3;

public class Pedido implements Bebida {
    private Bebida bebida;

    public Pedido(Bebida bebida) {
        this.bebida = bebida;
    }

    public void acrescentarComplemento(Bebida complemento) {
        this.bebida = complemento;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco();
    }
}
