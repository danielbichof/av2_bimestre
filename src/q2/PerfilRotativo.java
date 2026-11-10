package q2;

public class PerfilRotativo implements PerfilCobranca {
    public static final double VALOR_POR_HORA = 10.00;

    @Override
    public double calcularValor(int tempoMinutos) {
        if (tempoMinutos <= 0) {
            return 0.0;
        }

        int horasIniciadas = (int) Math.ceil(tempoMinutos / 60.0);
        return horasIniciadas * VALOR_POR_HORA;
    }

    @Override
    public String getNomePerfil() {
        return "Rotativo";
    }
}
