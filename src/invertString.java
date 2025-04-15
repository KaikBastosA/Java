import java.util.Scanner;

public class invertString {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira uma palavra que queira inverter: ");
        String palavra = entrada.nextLine();
        entrada.close();
        String palavraI = "";
        for(int i = palavra.length() -1; i >= 0; i--){
            palavraI += palavra.charAt(i);
        }
        System.out.printf("A palavra invertida fica: %s", palavraI);
    }
}
