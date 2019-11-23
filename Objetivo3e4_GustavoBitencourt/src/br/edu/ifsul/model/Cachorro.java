package br.edu.ifsul.model;

public final class Cachorro extends Animal implements AnimalMagico {

    private String nome;

    public Cachorro() {
        super();
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }


    @Override
    public void falar(String frase) {
        System.out.println("Oi, sou o Nome, um Cachorro");
        return;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um Cachorro");
    }

    @Override
    public void getNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
