import java.util.Scanner;

public class triangulo {
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        System.out.printf("Insira, na mesma linha, as 3 coordenadas do triângulo: ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        z = entrada.nextInt();
        entrada.close();
        if(x == y && y == z) System.out.printf("O triangulo é Equilátero.");
        else if(x == y || y == z || x == z) System.out.printf("O triangulo é Isósceles.");
        else System.out.printf("O triangulo é Escaleno.");

    }
}
