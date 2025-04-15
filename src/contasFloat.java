import java.util.Scanner;

public class contasFloat {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.printf("Insira os 2 valores na mesma linha: ");
    float num1 = entrada.nextFloat();
    float num2 = entrada.nextFloat();
    entrada.close();
    System.out.printf("A soma é: %.2f\nA subtração é: %.2f\nA multiplicação é: %.2f\nA divisão é %.2f\n", (num1 + num2), (num1 - num2), (num1 * num2) ,(num1 / num2));
  }   
}
