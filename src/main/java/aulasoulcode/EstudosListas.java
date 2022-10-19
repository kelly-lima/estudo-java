package aulasoulcode;

import java.util.ArrayList;

public class EstudosListas {
    public static void main(String[] args){
        // cria um novo ArrayList vazio que guarda interger
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();


        // Adicionando elementos no array
        numeros.add(10); // equivale ao push no js
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);
        System.out.println(numeros.get(2));

        System.out.println(numeros.set(0, 500));

        System.out.println(numeros);

        // remove o elemento na posição 0
        numeros.remove(0);

        System.out.println(numeros);
        numeros.add(1,200);
        System.out.println(numeros);

        numeros.add(3,200);
        System.out.println(numeros);

        System.out.println(numeros.size());  // array.length

        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("---------------");
        for(int numero:numeros){ // para cada valor dentro de array ele executa o codigo
            int total = numero += 1;   // posso modificar
            System.out.println(total);
        }

        System.out.println(numeros.contains(500)); // true =  achou, false = não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição do 1000 na lista?
        System.out.println(numeros.indexOf(500)); // -1 = não achou o elemento  o valor que acha é a posição
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontrado
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado

    }
}
