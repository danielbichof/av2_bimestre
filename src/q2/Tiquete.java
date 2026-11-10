package q2;

public class Tiquete {
    private String placa;
    private int tempoPermanenciaMinutos;
    private PerfilCobranca perfilCobranca;

    public Tiquete(String placa, int tempoPermanenciaMinutos, PerfilCobranca perfilCobranca) {
        this.placa = placa;
        this.tempoPermanenciaMinutos = tempoPermanenciaMinutos;
        this.perfilCobranca = perfilCobranca;
    }

    public double calcularValor() {
        if (perfilCobranca == null) {
            throw new IllegalStateException("Perfil de cobrança não configurado para o tíquete.");
        }
        return perfilCobranca.calcularValor(tempoPermanenciaMinutos);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTempoPermanenciaMinutos() {
        return tempoPermanenciaMinutos;
    }

    public void setTempoPermanenciaMinutos(int tempoPermanenciaMinutos) {
        this.tempoPermanenciaMinutos = tempoPermanenciaMinutos;
    }

    public PerfilCobranca getPerfilCobranca() {
        return perfilCobranca;
    }

    public void setPerfilCobranca(PerfilCobranca perfilCobranca) {
        this.perfilCobranca = perfilCobranca;
    }

    @Override
    public String toString() {
        String nomePerfil = (perfilCobranca != null) ? perfilCobranca.getNomePerfil() : "Não definido";
        return String.format("Tíquete [Placa: %s | Tempo: %d min | Perfil: %s | Valor: R$ %.2f]",
                placa,
                tempoPermanenciaMinutos,
                nomePerfil,
                calcularValor());
    }
}
