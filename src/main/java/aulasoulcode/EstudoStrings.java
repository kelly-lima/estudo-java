package aulasoulcode;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args){
        // Strings são cadeias de caracteres
        String nome = "pedro";
      //if (nome == "pedro"){ // conferindo se o endereco é o mesmo
         // System.out.println("São iguais!");

        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if (sobrenome.equals("pereira")){ // conferindo se o endereco é o mesmo
            System.out.println("São iguais!");

      } else{
            System.out.println("São diferentes");
        }

       // sobrenome.equalsIgnoreCase("são diferentes")

        // outros métodos
        String java = "java";
        String ja = java.substring(0, 2); // comeca do 0 vai ate 2
        String va = java.substring(2); // corta do 2 até o final da string


        String m1 = "hello";
        String m2 =  "world;" ;
        String m3 = m1.concat(m2);
        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se está vazia -> ""
        System.out.println(java.toLowerCase()); // Java em caixa alta
        System.out.println(java.toLowerCase()); // java em caixa baixa

        //Exemplo
        System.out.println("Digite um nome: ");
        String seuNome = entrada.nextLine();

        if(seuNome.toLowerCase().equals("JOSÉ")){
            System.out.println("SE NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/"); // ["13", "10", "2022"]
        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String[] valoresEmail = email.split("@");
        System.out.println(valoresEmail[0]);

        String nome2 = "josé Souza";
        String[] nomesSeparado = nome2.split(" ");
        System.out.println(valoresEmail[0]);

        String teste = "Amanha é sexta-feira!";
        String[] teste2 =  teste.split("");
        System.out.println(Arrays.toString(teste2)); // mostra o que tem dentro do array


    }
}
