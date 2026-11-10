package q1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private final List<AreaInteressada> areasInteressadas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        if (this.quantidade == novaQuantidade) {
            return;
        }

        int quantidadeAnterior = this.quantidade;
        this.quantidade = novaQuantidade;
        notificarAreas(quantidadeAnterior, novaQuantidade);
    }

    public void alterarQuantidade(int novaQuantidade) {
        setQuantidade(novaQuantidade);
    }

    public void adicionarArea(AreaInteressada area) {
        if (area != null && !areasInteressadas.contains(area)) {
            areasInteressadas.add(area);
        }
    }

    public void removerArea(AreaInteressada area) {
        areasInteressadas.remove(area);
    }

    public void adicionarAreaInteressada(AreaInteressada area) {
        adicionarArea(area);
    }

    public void removerAreaInteressada(AreaInteressada area) {
        removerArea(area);
    }

    private void notificarAreas(int quantidadeAnterior, int novaQuantidade) {
        for (AreaInteressada area : new ArrayList<>(areasInteressadas)) {
            area.atualizar(this, quantidadeAnterior, novaQuantidade);
        }
    }
}
