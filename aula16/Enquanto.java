import java.util.Scanner;

public class Enquanto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i < max) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        do {

            i++;
            System.out.println("Valor de i: " + i);

        } while (i < 15);

        System.out.println(i);
    }
}
