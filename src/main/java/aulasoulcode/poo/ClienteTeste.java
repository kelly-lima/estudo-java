package aulasoulcode.poo;

import java.time.LocalDate;

// Encapsulamento =>
// Escolhe quais atributos/métodos serão visíveis fora da classe
// public (padrão) => vísivel para todos
// private => os métodos/atributos são visiveis apenas na classe
// protected => bem parecido com o private
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Felipe", "José", LocalDate.of(1993, 5, 25), 1.85, 95.0);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);
        cliente1.setAltura(1.5);

        Pessoa pedro = new Pessoa("Pedro", "José", 29, 1.8, 80);

        Pessoa joao = new Pessoa("João", "Carlos", 30, 1.75, 90);
        System.out.println("================");

        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);
    }


}