package br.eu.com;

public class Quadrado implements Forma {
    public double lado;
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}


