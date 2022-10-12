package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha a operação que desja realizar:");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        int operador = entrada.nextInt();

        System.out.println("Informe o primeiro valor");
        int primeirovalor = entrada.nextInt();

        System.out.println("Escolha o segundo valor: ");
        int segundovalor = entrada.nextInt();

        switch (operador){
            case 1:
                int total = primeirovalor + segundovalor;
                System.out.println("A soma entre os valores vale:  " + total);
                break;

            case 2:
                int total2 = primeirovalor - segundovalor;
                System.out.println("A subtração entre os valores vale: " + total2);
                break;

            case 3:
                int total3 = primeirovalor * segundovalor;
                System.out.println("A multiplicação entre os valores vale: " + total3);
                break;

            case 4:
                double total4 = (double)primeirovalor / segundovalor;
                System.out.println("A divisão entre os valores vale: " + total4);
                break;

            default:
                System.out.println("Operação invalida!");
        }



    }
}
