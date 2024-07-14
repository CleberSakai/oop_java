package Escola;

public class Principal {
    
    public static void main(String[] args) {

        Aluno alunoNovo = new Aluno("Cleberson", "333.444.333-01", 1455);
        alunoNovo.info();
        
        Professor novoProfessor = new Professor("Leonardo", "Ciência de Dados", 1466);
        novoProfessor.info();

        
    }

}
