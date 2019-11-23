package br.edu.ifsul.model;

public class Peixe extends Animal {

    private double z;
    private String nome;

    public Peixe() {
        super();
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover3D(double x, double y, double z){
        super.mover(x, y);
        this.z = z;
    }



    @Override
    public void desenhar() {
        System.out.println("Desenhou um Peixe");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
