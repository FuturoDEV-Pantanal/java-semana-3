package aula_2.classe_abstrata.entities;

import aula_2.classe_abstrata.enums.Cor;

//possuem atributos e métodos (abstratos)
public abstract class Forma {
    
    //atributo geral para todas as classes filhas.
    private Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    //metodo abstrato
    //calcula a area da forma
    public abstract double area();

    

}
