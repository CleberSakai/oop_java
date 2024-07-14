package Banco;

public class Conta {
    
    int numero;
    String titular;
    double saldo;
    double limite;

    Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    boolean sacar(double valor) {

        if(valor > limite || valor > saldo || valor <= 0) {
            return false;
        }
        saldo -= valor; // saldo = saldo - valor;
        return true;
    }


    boolean depositar(double valor) {
        if(valor <= 0) {
            return false;
        }

        saldo += valor;
        return true;
    }

    void transfere(Conta titular, double valor) {
        if(valor > saldo || valor > limite) {
            System.out.println("Trasnferencia não permitida");
        };

        this.saldo = this.saldo - valor;
        titular.saldo = titular.saldo + valor;
    }

    void info() {
        System.out.println("Nome: " + titular);
        System.out.println("Numero " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
}
