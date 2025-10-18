package org.example.model;

public class Pagamento {

    private String tipo;
    private double valor;

    public Pagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
