package aula_2.classe_abstrata;
import aula_2.classe_abstrata.entities.Circulo;
import aula_2.classe_abstrata.entities.Forma;
import aula_2.classe_abstrata.entities.Retangulo;
import aula_2.classe_abstrata.enums.Cor;

public class Main {

    public static void main(String[] args){

        //implementar os objetos geométricos
        Circulo forma1 = new Circulo(Cor.BLUE,8.8);
        Retangulo forma2 = new Retangulo(Cor.WHITE, 5.5, 4.5);

        System.out.println(forma1.getClass());

        Boolean resutlado = forma1 instanceof Circulo;
        System.out.println(resutlado);
       
        System.out.println("Area do circulo: " + forma1.area());
        System.out.println("Area do retangulo: " + forma2.area());
    }
    
}
