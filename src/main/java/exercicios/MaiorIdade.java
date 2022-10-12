package exercicios;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");

        int idade = entrada.nextInt();
        if(idade >= 18){
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Status: Alcançou a maioridade"  );
        }else{
            System.out.println("Idade: " + idade + " anos" );
            System.out.println("Status: Não alcançou a maioridade" );
        }


    }
}
