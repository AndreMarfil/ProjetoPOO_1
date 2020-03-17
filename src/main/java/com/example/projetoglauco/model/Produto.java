package com.example.projetoglauco.model;

/**
 * Produto
 */
public class Produto {

    private int codigo;
    private String Nome;
    private double valor;
    private int estoque;

    public Produto(){
    }

    public Produto(int codigo, String nome, double valor, int estoque) {
        this.codigo = codigo;
        this.Nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto [Nome=" + Nome + ", codigo=" + codigo + ", estoque=" + estoque + ", valor=" + valor + "]";
    }

   
}