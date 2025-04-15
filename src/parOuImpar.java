import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int value = 0;
        System.out.printf("Insira um valor: ");
        value = entrada.nextInt();
        entrada.close();
        if (value % 2 == 0) {
            System.out.printf("O número %d é par!", value);
        } else {
            System.out.printf("O valor %d é impar!", value);
        }
    }
}