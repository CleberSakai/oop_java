package Banco;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta(111, "Cleber", 2000, 500);
        Conta c2 = new Conta(222, "luziana", 0, 0);
        c1.info();
        c2.info();

        c1.transfere(c2, 1000);

        if(!c1.sacar(0)); {
            System.out.println("Problema ao sacar!");
        }

        if(!c1.depositar(0)) {
            System.out.println("Problema ao depositar!");
        }
        c1.info();
        c2.info();
    };
};
