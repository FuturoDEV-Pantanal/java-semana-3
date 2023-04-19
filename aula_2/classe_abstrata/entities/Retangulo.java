package aula_2.classe_abstrata.entities;
import aula_2.classe_abstrata.enums.Cor;

public class Retangulo extends Forma {

    private Double altura;
    private Double largura;

    public Retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
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
