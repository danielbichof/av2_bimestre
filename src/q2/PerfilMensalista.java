package q2;

public class PerfilMensalista implements PerfilCobranca {
    public static final double VALOR_FIXO = 50.00;

    @Override
    public double calcularValor(int tempoMinutos) {
        return VALOR_FIXO;
    }

    @Override
    public String getNomePerfil() {
        return "Mensalista";
    }
}
