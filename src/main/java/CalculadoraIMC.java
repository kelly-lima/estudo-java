import java.util.Scanner;    // obrigatorio importar

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine(); /// tipo string é nextLine()

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso? (kg)");
        double peso = entrada.nextDouble();

       // Caculo do imc = peso / altura ^ 2
        double imc = peso / Math.pow(altura, 2);
        // imc = peso / (altura * altura);


        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos!");

        System.out.println("Este é o seu IMC = " + imc);

        //%.2f numero double float
        System.out.printf("Este é o seu IMC = %.2f\n", imc);

        // %s string %d inteiro
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);
        // printf não pula linha

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if(imc >= 17 && imc <= 18.49){
            System.out.println(" abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("peso normal");
        } else if(imc >= 25 && imc <= 29.99){
            System.out.println("acima do peso");
        } else if(imc >30 && imc <= 34.99){
            System.out.println("obesidade tipo I");
        } else if(imc >= 35 && imc <= 39.99){
            System.out.println("obesidade tipo II(severa)");
        } else{
            System.out.println("obesidade III(móbida)");
        }

        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Agua");
        System.out.println("2 - fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da Água!");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da Fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da Batata!");
                break;
            default:// "else"
                System.out.println("Esta dieta não existe!");
        }

        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for (int i = 0; i <= totalAlimentos; i++){
                System.out.println(i);
                // String alimento = entrada.nextLine();
                 //System.out.println("você gosta de " + alimento);

        }

        int i = 0;
        while( i < totalAlimentos){
            System.out.println(i);
            i++;
        }

    }
}
