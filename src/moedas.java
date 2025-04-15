import java.util.Scanner;

public class moedas {
    public static void main(String [] args){
        float coinQtd = 0;
        int umReal = 0, cinqCent = 0, vinCent = 0, dezCent = 0, cincCent = 0, umCent = 0;  
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira uma quantidade de moedas em centavos: ");
        coinQtd = entrada.nextFloat();
        entrada.close();
        int initialValue = (int)coinQtd;
        coinQtd = coinQtd / 100;

        while (coinQtd != 0) {
            if(coinQtd >= 1){
                coinQtd -= 1;
                umReal += 1;
            }
            else if(coinQtd >= 0.5){
                coinQtd -= 0.5;
                cinqCent += 1;
            }
            else if(coinQtd >= 0.25){
                coinQtd -= 0.25;
                vinCent += 1;
            }
            else if(coinQtd >= 0.10){
                coinQtd -= 0.10;
                dezCent += 1;
            }
            else if(coinQtd >= 0.05){
                coinQtd -= 0.05;
                cincCent += 1;
            }
            else{
                coinQtd -= 0.01;
                umCent += 1;
            }
        }
        System.out.printf("Para o valor %d, a menor quantidade de moeda(s) é %d moeda(s) de 1 real, %d moeda(s) de 50 centavos, %d moeda(s) de 25 centavos, %d moeda(s) de 10 centavos, %d moeda(s) de 5 centavos e %d moeda(s) de 1 centavo", initialValue, umReal, cinqCent, vinCent, dezCent, cincCent, umCent);
    }
}


