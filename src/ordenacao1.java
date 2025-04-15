import java.util.Scanner;

public class ordenacao1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira 3 valores, na mesma linha, para ordena-los: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        entrada.close();
        if(a > b){
            int aux = a;
            a = b;
            b = aux;
        }
        else if(a < b){
            if(a > c){
                int aux = a;
                a = c;
                c = aux;
            }
        }
        if(b > c){
            int aux = b;
            b = c;
            c = aux;
            if(b < a){
                int aux1 = b;
                b = a;
                a = aux1;
            }
        }
        System.out.printf("De forma ordenada, os numeros inseridos são: %d %d %d", a, b, c);
    }
}
