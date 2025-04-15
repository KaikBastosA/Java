import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int ano = entrada.nextInt();
        entrada.close();
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.printf("O ano %d é bissexto!", ano);
        }
        else System.out.printf("O ano %d não é bissexto", ano);
    }
}
