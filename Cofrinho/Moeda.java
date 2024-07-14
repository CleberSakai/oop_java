package Cofrinho;

public class Moeda {
    
    public Moeda(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }

    private String nome;
    private double valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

}
