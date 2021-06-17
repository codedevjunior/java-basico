import java.util.Scanner;

public class Manu {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int op;
        System.out.println("1. Entrar: ");
        System.out.println("2. Sair: ");

        do {

            System.out.println("Escolhe a opção: ");
            op = scan.nextInt();

        } while (op != 2);

        if(op == 2){
            System.out.println("Saindo do programa...");
        }
    }
}
