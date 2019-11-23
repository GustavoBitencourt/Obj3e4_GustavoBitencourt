package br.edu.ifsul.control;

import br.edu.ifsul.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Criando e Imprimindo A-

        Peixe peixe1 = new Peixe(2, 2, 2);
        System.out.println(peixe1);

        Peixe peixe2 = new Peixe(5,5, 5);
        System.out.println(peixe2);

        Peixe peixe3 = new Peixe(6,6, 6);
        System.out.println(peixe3);

        Cachorro cachorro1 = new Cachorro(1, 1);
        System.out.println(cachorro1);

        Cachorro cachorro2 = new Cachorro(7, 7);
        System.out.println(cachorro2);

        Cachorro cachorro3 = new Cachorro(8, 8);
        System.out.println(cachorro3);

        Passaro passaro1 = new Passaro(3, 3);
        System.out.println(passaro1);

        Passaro passaro2 = new Passaro(9, 9);
        System.out.println(passaro2);

        Passaro passaro3 = new Passaro(8, 8);
        System.out.println(passaro3);


        //Coleções B-

        List<Animal> animais = new ArrayList<>();
        animais.add(peixe1);
        animais.add(peixe2);
        animais.add(peixe3);
        animais.add(cachorro1);
        animais.add(cachorro2);
        animais.add(cachorro3);
        animais.add(passaro1);
        animais.add(passaro2);
        animais.add(passaro3);
        System.out.println("\nTodos Animais" + animais);

        List<Animal> magicos = new ArrayList<>();
        magicos.add(passaro1);
        magicos.add(passaro2);
        magicos.add(passaro3);
        magicos.add(cachorro1);
        magicos.add(cachorro2);
        magicos.add(cachorro3);
        System.out.println("\nAnimais Mágicos" + magicos);


        //Movimentando C-

        System.out.println("\nMovimentando todos animais para as coordenadas x=5.0 e y=5.0");
        animais.forEach((a) -> {
            a.mover(5.0, 5.0);
            a.desenhar();
            System.out.println(a);
        });

        System.out.println("\nMovimentando os animais mágicos para as coordenadas x=5.0 e y=5.0");
        magicos.forEach((m) -> {
            m.mover(5.0, 5.0);
            m.desenhar();
            System.out.println(m);
        });


        //Animais se apresentando D-
        System.out.println("\nAnimais Mágicos Falando");
        magicos.forEach((m) -> {
           // m.falar(nome);
            System.out.println();
        });



        //Movendo animais 3d E-
        System.out.println("\nMovendo Animais em 3D");
        animais.forEach((a) -> {
            if(a instanceof Peixe) {
                ((Peixe) a).mover3D(8, 8, 8);
                System.out.println(a);
            }
        });


        //Ordenando as coleções pela coordenada x em ordem descrescente F-
        animais.sort(Comparator.comparingDouble(Animal::getX).reversed());
        System.out.println("\nTodos animais ordenados decrescente pela coordenada X\n" + animais);

        magicos.sort(Comparator.comparingDouble(Animal::getX).reversed());
        System.out.println("\nAnimais Mágicos Ordenados decrescente pela coordenada X X\n" + magicos);


    }
}
