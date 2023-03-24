package org.example;


public class Produto implements Cloneable {
    private int id;
    private String nome;
    private double preco;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preço=" + preco +
                '}';
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        return produtoClone;
    }
}