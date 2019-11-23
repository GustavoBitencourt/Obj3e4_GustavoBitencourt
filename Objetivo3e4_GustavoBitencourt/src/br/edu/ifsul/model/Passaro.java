package br.edu.ifsul.model;

public final class Passaro extends Animal implements AnimalMagico {

    private String nome;

    public Passaro() {
        super();
    }

    public Passaro(double x, double y) {
        super(x, y);
    }


    @Override
    public void falar(String frase) {
        System.out.println("Oi, sou o Nome, um Passaro");
        return;
    }

    @Override
    public void getNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um Pássaro");

    }

    @Override
    public String toString() {
        return "Passaro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }




}