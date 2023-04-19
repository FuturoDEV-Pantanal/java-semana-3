package aula_2.interfaces.entities;

import aula_2.classe_abstrata.enums.Cor;

public class Circulo extends FormaAbstrata {

    private Double raio;

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;

    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    @Override
    public double area(){
        return Math.PI * raio * raio;
    }
    
}
