package br.eu.com;

public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", anoFabricacao = " + anoFabricacao +
                ", preco = " + preco ;
    }
}


