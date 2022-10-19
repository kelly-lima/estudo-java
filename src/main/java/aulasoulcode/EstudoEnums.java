package aulasoulcode;

public class EstudoEnums {
    public static void main(String[] args){
        enum DiaDaSemana{
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO

        }
        DiaDaSemana hoje = DiaDaSemana. QUINTA;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel){
            case JUNIOR:
                System.out.println("Seu nivel é junior");
                break;

            case PLENO:
                System.out.println("Seu niveeo é PLENO");
                break;

            case SENIOR:
                System.out.println("Seu nível é SENIOR");
                break;
        }
        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }


    }
}
