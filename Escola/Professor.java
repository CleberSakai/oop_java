package Escola;

public class Professor {

    String nome;
    String formacao;
    int cadastro;

    public Professor(String nome, String formacao, int cadastro) {

        this.nome = nome;
        this.formacao = formacao;
        this.cadastro = cadastro;


    }

    void info () {
        System.out.println("Nome: " + nome);
        System.out.println("Formação: " + formacao);
        System.out.println("Cadastro: " + cadastro);
    }
}