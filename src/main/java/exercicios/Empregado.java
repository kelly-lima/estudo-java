package exercicios;

public class Empregado {
    String nome;
    String sobrenome ;
    double salario;

    Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    double calcularSalarioAnual(){
       return this.salario * 12;
    }

    double aumentoDeSalario(double valor){
        return this.salario += valor;
    }

      public String getnomeCompleto(){
       return  this.nome + " " + this.sobrenome;
    }

    public static void main(String[] args){
        Empregado empregado1 =  new Empregado("ana", "lima", 1400);
        System.out.println(empregado1.calcularSalarioAnual());
        System.out.println(empregado1.aumentoDeSalario(100));
        System.out.println(empregado1.getnomeCompleto());
    }

}
