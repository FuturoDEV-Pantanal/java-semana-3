package aula_3.modificadores.program;

import aula_3.modificadores.entities.Animal;
import aula_3.modificadores.entities.Cachorro;
import aula_3.modificadores.entities.Gato;

public class Programa {
    
    public static void main(String[] args) {

        Animal animal = new Animal("Animal Genérico", "Genérico", 1000);

       


        Gato gato = new Gato("Mingau", "Felino", 3, "branco");
       
        gato.interfacePrintInfo();

    }

}
