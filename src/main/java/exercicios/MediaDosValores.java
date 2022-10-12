package exercicios;

import java.util.Scanner;

public class MediaDosValores {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Quantos valores deseja informar? ");
        int escolha = entrada.nextInt();

        double  valores [] = new double[escolha];

        for(int i = 0; i < escolha; i++){
            System.out.println("Digite o valor: ");
            valores[i] = entrada.nextDouble();
        }
        double soma = 0.0;
        for(double numero: valores){
            soma += numero;
        }
        double media = soma / valores.length;
        System.out.println("A soma de todos os valores vale: " + soma);
        System.out.printf("A média dos valores vale: %.2f\n",  media);
    }
}
