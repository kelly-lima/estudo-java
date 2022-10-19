package exercicios;

import java.util.ArrayList;

public class Livro {
    String nome;
    String autor;
    double preco;

    Livro(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    ArrayList<Livro> novos = new ArrayList<>();


    String getdadosLivro(){
        return "Livro: " + this.nome + " \nValor: R$ " + this.preco + " \nAutor:" + this.autor;
    }


    public static void main(String[] args){
        Livro livro1 = new Livro("Orientação a Objetos", "Thiago Leite", 79.90);
        System.out.println(livro1.getdadosLivro());



    }


}
