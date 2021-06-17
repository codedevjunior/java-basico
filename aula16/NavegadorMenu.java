
import java.util.Scanner;

public class NavegadorMenu {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Menu Inicial\n\n");
        int opcao;

        do {
            
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Imprimir Relatório");
            System.out.println("4. Sair");

            System.out.println("Escolhe a opção desejada: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Você pode cadastrar o cliente agora");
            } else if (opcao == 2){
                System.out.println("Listando os clientes cadastrados");
            } else if (opcao == 3){
                System.out.println("Gerando um relatório");
            }

        } while (opcao != 4);

        if (opcao == 4){
            System.out.println("Você saiu do programa...");
        }

    }
}
