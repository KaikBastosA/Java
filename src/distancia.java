import java.util.Scanner;

public class distancia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira, na mesma linha, a distância percorrida, o tempo gasto e a quantidade de gasolina consumida: ");
        float dist = entrada.nextFloat();
        float time = entrada.nextFloat();
        float gas = entrada.nextFloat();
        entrada.close();
        System.out.printf("A velocidade média foi de %d Km/h e a o consumo de combistível foi de %.1f Km/l.", (int)(dist/time), (dist / gas));
    }
}
