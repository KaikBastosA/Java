import java.util.Scanner;
public class conversorTemp {
    public static void main(String[] args){
        int celsius = 0;
        int fahrenheit = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Celsius: ");
        celsius = entrada.nextInt();
        entrada.close();
        fahrenheit = (int)(celsius * 1.8f) + 32;
        System.out.printf("%d° equivalem a %d°F", celsius, fahrenheit);
    }
}
