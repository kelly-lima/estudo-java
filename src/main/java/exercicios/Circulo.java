package exercicios;

public class Circulo {

     private double raio;
     private String cor;

   public Circulo(){
       this.raio = 1;
       this.cor = cor;
   }



    Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }

    double calcularArea(){
       return  (Math.PI * this.raio * this.raio);
    }

    double circuferenciaRaio(){
       return (2 * Math.PI) * this.raio;
    }

    double mudarRaio(double novoRaio){
        return novoRaio;

    }



    public static void main(String[] args){
        Circulo circulo1 = new Circulo(3, "amarelo");
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.circuferenciaRaio());
       double circulo2 = circulo1.mudarRaio(3);
        System.out.println(circulo2);
    }

}
