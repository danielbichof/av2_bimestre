package q2;

public class PerfilConveniado implements PerfilCobranca {
    public static final int MINUTOS_GRATUIDADE = 30;
    public static final double VALOR_POR_HORA = 10.00;
    public static final double PERCENTUAL_DESCONTO = 0.20;

    @Override
    public double calcularValor(int tempoMinutos) {
        if (tempoMinutos <= MINUTOS_GRATUIDADE) {
            return 0.0;
        }

        int minutosExcedentes = tempoMinutos - MINUTOS_GRATUIDADE;
        int horasIniciadas = (int) Math.ceil(minutosExcedentes / 60.0);

        double valorBruto = horasIniciadas * VALOR_POR_HORA;
        return valorBruto * (1.0 - PERCENTUAL_DESCONTO);
    }

    @Override
    public String getNomePerfil() {
        return "Conveniado";
    }
}
