package Desafio;

import java.time.LocalDate;
import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {
        HashMap<String, LocalDate> aniversarios = new HashMap<String, LocalDate>();
        
        aniversarios.put("Cleberson", LocalDate.of(2002, 5, 23));
        aniversarios.put("Luziana", LocalDate.of(1979, 5, 23));
        aniversarios.put("Isabella", LocalDate.of(2012, 5, 23));

        for(String nome : aniversarios.keySet()) {
            LocalDate aniversario = aniversarios.get(nome);
            System.out.println(nome + ": " +aniversario);
        }
    }

    
}
