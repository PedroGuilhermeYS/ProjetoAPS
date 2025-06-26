package model;

public class Produto {
    private String Nome;
    private double Preco;
    private double Peso;

    public Produto(String Nome, double Preco, double Peso) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Peso = Peso;
    }

    public String getNome() {
        return Nome;
    }
    public double getPreco() {
        return Preco;
    }
    public double getPeso() {
        return Peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + Nome + '\'' +
                ", preco=" + Preco +
                ", peso=" + Peso +
                '}';
    }
}