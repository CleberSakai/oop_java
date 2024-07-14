package Escola;

public class Aluno {

    String nome;
    String cpf;
    int matricula;


    public Aluno(String nome, String cpf, int matricula) {

        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;

    }

    void info() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Matricula: " + matricula);
    }
}