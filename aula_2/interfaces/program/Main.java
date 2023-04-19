package aula_2.interfaces.program;

import java.text.Normalizer.Form;

import aula_2.classe_abstrata.enums.Cor;
import aula_2.interfaces.entities.Circulo;
import aula_2.interfaces.entities.FormaAbstrata;
import aula_2.interfaces.entities.Retangulo;

public class Main {

    public static void main(String[] args){

        FormaAbstrata forma1 = new Circulo(Cor.BLUE, 8.5);
        FormaAbstrata forma2 = new Retangulo(Cor.BLACK, 6.5, 3.3);

        System.out.println("A cor do Circulo é: " + forma1.getCor());
        System.out.println("A área do Circulo é: " + forma1.area());
    }
    
}
