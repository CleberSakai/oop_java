package Aluno;

public class principal {
    public static void main(String[] args) {
        
        Estudante e1 = new Estudante("Cleberson", "Programador", new Avaliacao(9, 10, 3));
        Estudante e2 = new Estudante("Carlos Luan", "Engenheiro Mecanico", new Avaliacao(10, 10, 8));

        e1.info();
        e2.info();

    }
}
