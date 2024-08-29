import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto arroz = new Produto();
        arroz.marca = "Codil";
        arroz.tipo = "integral";
        arroz.estoque = 100;
        arroz.preco = 8.50;

        Produto feijao = new Produto();
        feijao.marca = "Tio João";
        feijao.tipo = "carioca";
        feijao.estoque = 340;
        feijao.preco = 7.23;

        Produto leite = new Produto();
        leite.marca = "Ninho";
        leite.tipo = "integral";
        leite.estoque = 7888;
        leite.preco = 4.50;

        List<Produto> produtos = new ArrayList<>(List.of(arroz, feijao, leite));
        for (Produto produto : produtos) {
            System.out.println("=============== PRODUTO ================");
            System.out.println("Marca: " + produto.marca);
            System.out.println("Tipo: " + produto.tipo);
            System.out.println("Estoque: " + produto.estoque);
            System.out.println("Preco: " + produto.preco);

        }


        Filme novoFilme = new Filme();
        novoFilme.titulo = "O chamado";
        novoFilme.ano = 2002;
        novoFilme.genero = "Terror";
        novoFilme.duracaoMinutos = 115;

        Filme novoFilme2 = new Filme();
        novoFilme2.titulo = "Shrek";
        novoFilme2.ano = 2001;
        novoFilme2.genero = "Fantasia";
        novoFilme2.duracaoMinutos = 115;

        Filme novoFilme3 = new Filme();
        novoFilme3.titulo = "Matrix";
        novoFilme3.ano = 1999;
        novoFilme3.genero = "Ficção científica";
        novoFilme3.duracaoMinutos = 136;

        JogadorFutebol jogadorFutebol1 = new JogadorFutebol();
        jogadorFutebol1.nome = "João";
        jogadorFutebol1.clube = "Santos";
        jogadorFutebol1.idade = 22;
        jogadorFutebol1.posicao = "Meia-atacante";
        jogadorFutebol1.numero = 9;

        JogadorFutebol jogadorFutebol2 = new JogadorFutebol();
        jogadorFutebol2.nome = "Carlos";
        jogadorFutebol2.clube = "Vasco";
        jogadorFutebol2.idade = 29;
        jogadorFutebol2.posicao = "Zagueiro";
        jogadorFutebol2.numero = 22;

        JogadorFutebol jogadorFutebol3 = new JogadorFutebol();
        jogadorFutebol3.nome = "Edvado";
        jogadorFutebol3.clube = "Cruzeiro";
        jogadorFutebol3.idade = 32;
        jogadorFutebol3.posicao = "Meio-campo";
        jogadorFutebol3.numero = 12;

        Receita bolo = new Receita();
        bolo.rendimento = 8;
        bolo.nivelDificuldade = "Fácil";
        bolo.tempoPreparo = 40;
        List<String> ingredientesBolo = new ArrayList<>(List.of("Ovo", "Farinha", "Manteiga", "Fermento", "Açúcar", "Óleo", "Cenoura"));
        bolo.ingredientes = ingredientesBolo;

        Receita strogonoff = new Receita();
        strogonoff.rendimento = 6;
        strogonoff.nivelDificuldade = "Fácil";
        strogonoff.tempoPreparo = 20;
        List<String> ingredientesStrogonoff = new ArrayList<>(List.of("Frango", "Creme de leite", "Cebola", "Sal", "Temperos", "Óleo", "Molho de tomate", "Batata palha"));
        strogonoff.ingredientes = ingredientesStrogonoff;

        Receita sushi = new Receita();
        sushi.rendimento = 30;
        sushi.nivelDificuldade = "Difícil";
        sushi.tempoPreparo = 40;
        List<String> ingredientesSushi = new ArrayList<>(List.of("Arroz", "Atum", "Alga", "Shoyu", "Teriyaki", "Wasabi", "Vinagre de arrozz"));
        sushi.ingredientes = ingredientesSushi;


    }
}