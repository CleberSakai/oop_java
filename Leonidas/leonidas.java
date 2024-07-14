package Leonidas;

import java.util.Scanner;

public class leonidas {
    public static void main(String[] args) {
        
        System.out.println("Digite seu palpite: ");
        Scanner teclado = new Scanner(System.in);
        int palpite;
        int valorCorreto = 10000;
        // String  msg;
        palpite = teclado.nextInt();
        

        // msg = palpite > valorCorreto? "Um pouco menos...":"Um pouco mais..."
        // Sytem.out.println(msg);
        while (palpite != valorCorreto) {
            if (palpite > valorCorreto) {
                System.out.println("Um pouco menos...");
            }
            else {
                System.out.println("Um pouco mais...");
            }

            System.out.println("Digite Outro Palpite: ");
            palpite = teclado.nextInt();
        }

        System.out.println("Parabéns chute correto!");

        

    }
}

// || = or
// && = and
// operador de negação = !