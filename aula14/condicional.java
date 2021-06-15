import java.util.Scanner;

/**
 * O que é controle de decisão
 * IF (se)
 * IF - ELSE (se - senão)
 * Múltiplos de if - else
 */

public class condicional {
    
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        System.out.println("Informe a primeira nota: ");
        nota1 = m.nextFloat();
        System.out.println("Informe a primeira nota: ");
        nota2 = m.nextFloat();
        System.out.println("Informe a primeira nota: ");
        nota3 = m.nextFloat();
        System.out.println("Informe a primeira nota: ");
        nota4 = m.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("Aprovado");
            if(media >= 10){
                System.out.println("Parabéns, você tirou a nota maxima!!");
            }
        } else if(media >= 5) {
            System.out.println("Recuperação");
        } else if(media < 5){
            System.out.println("Reprovado");
        }
    }
}
