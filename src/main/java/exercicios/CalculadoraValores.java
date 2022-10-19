package exercicios;

import java.util.Scanner;

public class CalculadoraValores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       // entrada.useLocale(Locale.US); // caso queira ler double com ponto

        System.out.println("Escolha a operação que desja realizar:");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        int operador = entrada.nextInt();

        System.out.println("Informe o primeiro valor");
        double primeirovalor = entrada.nextInt();

        System.out.println("Escolha o segundo valor: ");
        double segundovalor = entrada.nextInt();

        switch (operador){
            case 1:
                double soma = primeirovalor + segundovalor;
                System.out.println("A soma entre os valores vale:  " + soma);
                break;

            case 2:
                double subtracao = primeirovalor - segundovalor;
                System.out.println("A subtração entre os valores vale: " + subtracao);
                break;

            case 3:
                double multiplicacao = primeirovalor * segundovalor;
                System.out.println("A multiplicação entre os valores vale: " + multiplicacao);
                break;

            case 4:
                double divisao = primeirovalor / segundovalor;
                System.out.println("A divisão entre os valores vale: " + divisao);
                break;

            default:
                System.out.println("Operação invalida!");
        }



    }
}
