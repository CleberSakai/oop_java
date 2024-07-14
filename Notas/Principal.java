package Notas;

public class Principal {
    public static void main(String[] args) {
        
        Nota mario = new Nota();

        Nota luigui = new Nota(10, 7, 9);

        mario.setNota1 (9);
        mario.setNota2 (10);
        mario.setFaltas(5);
        
        mario.resultado();

        mario.setNota1(2);
        mario.setFaltas(10);

        mario.resultado();

        System.out.println();
        System.out.println("Media Luigui");
        luigui.resultado();

    }
}
