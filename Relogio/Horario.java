package Relogio;

public class Horario {
    int hora, minuto, segundo;

    public Horario(int hora, int minuto, int segundo) {
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

        if(hora > 23 || minuto > 59 || segundo > 59) {
            System.out.println("Ocorreu algum erro.");
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;



    };

    void info() {
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + minuto);
        System.out.println("Segundos: " + segundo);
    }


    
};
