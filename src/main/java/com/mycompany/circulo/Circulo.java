package com.mycompany.circulo;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI*radio*radio;
    }
    public double cArea(){
        return 2*Math.Pi*radio;
    }
}
