public class Variaveis {
    // execução do nosso programa Java
    public static void main(String[] args){
        System.out.println("hello, world!"); // equivale ao console.log

        int idade = 20; // inteiro
        double salario = 4500.99; // dupla precisao
        float nota = 7.5f; // sufixo para float
        long populacaoTerra = 7_900_000_000l; // numero grandes pq só colocando sem casa descimal ele entende que é inteiro
        // e numeros inteiros existe uma quantidade para usar
        boolean tarefaConcluida = false; // (true ou false)
        int maior = 0, menor = 0; //multiplas variaveis
        String nomeCompleto = "kelly cristina "; // string sempre aspas duplas

        int teste = 10;
        teste = 9; // reatribuição de variaveis

        final int teste2 = 200; // impossivel mudar o valor
        // pode usar em todos os tipos

        //operadores//
        int a = 10;
        int b  = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println(" o resultado vale " + soma);

        // A DIVISÃO ENTRE DOIS NUMEROS INTEIRO GERA UM RESULTADO INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois;
        System.out.println(resultado);
        double resultado2 = sete / dois2;
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); //12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);
        // CASTING != valor ( converte o valor )
        int pi2 = (int) Math.PI;
        System.out.println(pi2); // elimina  a parte descimal

        double resultado3 = sete / (double) dois ; // tranformou o segundo em double

        // Operadores 2

        int valor = 5;
        valor ++;
        valor--;
        valor += 10;

        // operadores lógicos
        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // true
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 5 >= 6; // true
        boolean teste7 = 5 <=9; //true

        // operadores logicos
        boolean teste8 = true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 =(5 > 10) && (10<5); // false
        boolean teste11 = (10 >= 0 ) || ( 1 < 5 );// true
        boolean teste12 = (5 > 1); //true
        boolean teste13 = !teste12; // false






    }
}
