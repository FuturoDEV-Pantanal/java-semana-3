package aula_2.classe_abstrata.entities;
import aula_2.classe_abstrata.enums.Cor;


//herança da classe abstrata Forma
public class Circulo extends Forma {

    private Double raio;

    //construturo
    public Circulo(Cor cor, Double raio){
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    //implementar o método abstrado herdado de forma!
    @Override
    public double area(){
        return Math.PI * raio * raio;
    }
    
}
