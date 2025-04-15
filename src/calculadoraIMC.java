import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.printf("Insira a sua altura: ");
        double altura = entrada.nextDouble();
        entrada.close();
        double imc = (peso / Math.pow(altura, 2));
        if(imc < 18.5){
            System.out.printf("Seu IMC é: %.2f\n", imc);
            System.out.printf("Seu IMC está abaixo de 18.5! Você está abaixo do peso");
        }
        else if(imc >= 18.5 && imc < 24.9){
            System.out.printf("Seu IMC é: %.2f\n", imc);
            System.out.printf("Seu IMC está entre 18.5 e 29.9! Parabéns, você está na faxa ideal");
        }
        else if(imc >= 25 && imc < 29.9){
            System.out.printf("Seu IMC é: %.2f\n", imc);
            System.out.printf("Seu IMC está maior que 25 e menor que 29.9! Você está com sobrepeso");
        }
        else{
            System.out.printf("Seu IMC é: %.2f\n", imc);
            System.out.printf("Seu IMC está acima de 30! Você possui obesidade");
        }
    }
}
