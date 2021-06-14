/**
 * O que são variaveis?
 * Como declarar variaveis?
 * Convenção de nomenclatura?
 * Tipos primitivos?
 */

public class varriaveis {
    
    public static void main(String[] args) {

        int idade = 27;
        String nome = "Vilson";
        String nomeDog = "Maylo";
        String nomeDoMeuCarro = "Gol G6";

        // não é uma boa pratica de programação
        int _idade;
        int $idade;
        String ano2021;
        String nome_do_meu_cachorro;
        String NomeDoMeuCarro;

        idade = 25; //atribuindo outro valor para a variavel idade

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Nome do meu Dog: " + nomeDog);
        System.out.println("Nome do meu carro: " + nomeDoMeuCarro);

    }
}
