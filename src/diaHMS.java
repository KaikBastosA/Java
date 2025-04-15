import java.util.Scanner;
public class diaHMS {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira quantos dias você quer converter: ");
        int dias = entrada.nextInt();
        entrada.close();
        System.out.printf("%d dias equivalem a: %d horas, %d minutos e %d segundos", dias, (dias*24), (dias*(24*60)), (dias*(24*(60*60))));
    }
}
