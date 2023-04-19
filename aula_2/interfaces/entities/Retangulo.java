package aula_2.interfaces.entities;
import aula_2.classe_abstrata.enums.Cor;

public class Retangulo extends FormaAbstrata{

    private Double largura;
    private Double altura;

    public Retangulo (Cor cor, Double largura, Double altura) {

        super(cor);
        this.largura = largura;
        this.altura = altura;

    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area(){
        return largura * altura;
    }
    
}
