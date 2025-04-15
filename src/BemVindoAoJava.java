import java.util.Scanner;

public class BemVindoAoJava {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    String nome = "";
    System.out.print("Digite o seu nome: ");
    nome = entrada.nextLine();
    entrada.close();
    System.out.printf("Olá %s! Bem-vindo ao Java!", nome);
    }
}
