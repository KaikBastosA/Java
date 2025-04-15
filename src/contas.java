import java.util.Scanner;

public class contas{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Insira 2 valores, na mesma linha, para realizar as operações: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        teclado.close();
        System.out.printf("A soma é: %d\nA subtração é: %d\nA multiplicação é: %d\nA divisão é %d\n", (num1 + num2), (num1 - num2), (num1 * num2) ,(num1 / num2));
    }
}