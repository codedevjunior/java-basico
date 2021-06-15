import java.util.Scanner;

public class scanner {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        System.out.println("Informe seu salario: ");
        salario = scan.nextDouble();

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Seu salario é " + salario);
    }
}
