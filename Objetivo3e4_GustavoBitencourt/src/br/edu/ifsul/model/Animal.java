package br.edu.ifsul.model;

public abstract class Animal {
    protected double x;
    protected double y;


    public Animal() {
    }

    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }


    public abstract void desenhar();

    @Override
    public String toString() {
        return "\nAnimal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
