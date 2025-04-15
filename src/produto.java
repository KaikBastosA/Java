import java.util.Scanner;

public class produto {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira o produto no formado - Nome Preço Quantidade: ");
        String nome = entrada.nextLine();
        float preco = entrada.nextFloat();
        int qtd = entrada.nextInt();
        entrada.close();
        if(qtd <= 10) System.out.printf("%s: %d", nome, preco);
        else if(qtd >= 11 && qtd < 21) System.out.printf("%s: %.2f", nome, preco - (preco*0.1));
        else if(qtd >= 21 && qtd < 51) System.out.printf("%s: %.2f", nome, preco - (preco * 0.2));
        else System.out.printf("%s: %d", nome, preco - (preco * 0.5));
    }
}
