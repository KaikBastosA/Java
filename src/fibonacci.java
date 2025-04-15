import java.util.Scanner;

public class fibonacci {
    public static void main(String [] args){
        int f0 = 0;
        int f1 = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira um valor não negativo: ");
        int valor = entrada.nextInt();
        entrada.close();
        if(valor == 0) System.out.printf("A sequência não tem um 0° digito");
        else if (valor == 1) System.out.printf("O 1° digito é %d", f0);
        else{
            System.out.printf("A sequência é: %d, %d, ", f0, f1);
            for(int i = 2; i < valor; i++){
                int fn = f0 + f1;
                System.out.printf("%d, ", fn);
                f0 = f1;
                f1 = fn;
            }
            System.out.println();
        }
    }
}
