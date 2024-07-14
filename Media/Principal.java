package Media;

public class Principal {

    public static void main(String[] args) {
        
        Avaliacao mario = new Avaliacao(7, 4, 10);

        System.out.println("Media Aritmetica do Mario: " + mario.mediaAritmetica());
        
        System.out.println("Media Ponderada do Mario: " + mario.mediaPonderada());
    };
    
}