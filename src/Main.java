import q1.AreaInteressada;
import q1.Auditoria;
import q1.Compras;
import q1.Produto;
import q1.Vendas;
import q2.PerfilConveniado;
import q2.PerfilMensalista;
import q2.PerfilRotativo;
import q2.Tiquete;
import q3.Bebida;
import q3.Calda;
import q3.Cha;
import q3.Chantilly;
import q3.Espresso;
import q3.Leite;
import q3.Pedido;

// Progarexema principal para testar as questões 1, 2 e 3
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.questao1();
        main.questao2();
        main.questao3();
    }
    
    void questao1() {
        System.out.println("Questão 1");
        Produto produto = new Produto("Smartphone Galaxy", 10);
        AreaInteressada auditoria = new Auditoria();
        produto.adicionarArea(new Compras());
        produto.adicionarArea(new Vendas());
        produto.adicionarArea(auditoria);

        produto.setQuantidade(4);
        produto.setQuantidade(4);
        produto.setQuantidade(0);
        produto.setQuantidade(12);
        produto.removerArea(auditoria);
        produto.setQuantidade(3);
    }

    void questao2() {
        System.out.println("Questão 2");
        Tiquete tiquete = new Tiquete("ABC-1234", 150, new PerfilRotativo());
        System.out.println("Rotativo: " + tiquete.calcularValor());

        tiquete.setPerfilCobranca(new PerfilMensalista());
        System.out.println("Mensalista: " + tiquete.calcularValor());

        tiquete.setPerfilCobranca(new PerfilConveniado());
        System.out.println("Conveniado: " + tiquete.calcularValor());
    }

    void questao3() {
        System.out.println("Questão 3");

        Bebida pedido1 = new Leite(new Espresso());
        System.out.println(pedido1.getDescricao() + ": " + pedido1.getPreco());

        Bebida pedido2 = new Calda(new Chantilly(new Cha()));
        System.out.println(pedido2.getDescricao() + ": " + pedido2.getPreco());

        Bebida pedido3 = new Leite(new Calda(new Calda(new Espresso())));
        System.out.println(pedido3.getDescricao() + ": " + pedido3.getPreco());
    }
}