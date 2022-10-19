package aulasoulcode;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length); // tamanho do array
        numeros[3] = 1000;
        //System.out.println(numeros[3]);

        for (int i = 0; i < numeros.length; i++) {
            //  System.out.println("A posição " +i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; //0..49
        numeros[0] = 500;
        numeros[1] = -200;

        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"josé Almor", "kelly cristina", "ana maria"};
        String[] sobrenome = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        //Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for (int i = 0; i < totalNotas; i++) {
            System.out.println("Digite sua nota: ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota: notasProva){ // para cada valor dentro de notasProva
            soma += nota;
        }
        double media = soma / notasProva.length;

        // condição ternária
        String mensagem = (media <7)? "você está REPROVADO " : "você está APROVADO;";
        System.out.print(mensagem);

        // Default value
        int numero; // padrao = 0
        double nota2; // padra = 0.0
        boolean teste; // padrao = false
        String nome; // null ausencia de objeto na variavel

        //wrapper clases
        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long pop = 1L;
        Boolean teste2 = false;
    }
}