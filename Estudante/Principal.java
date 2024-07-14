package Estudante;

public class Principal {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Cleberson", 44699, 0.1,  new Curso("Analise e Desenvolvimento de Sistemas", 1000));

        e1.info();
        System.out.println("Pagamento: " + e1.pagamento());
    }
}
