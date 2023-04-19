package aula_2.interfaces.entities;

import aula_2.classe_abstrata.enums.Cor;

public abstract class FormaAbstrata implements Forma {
    
    private Cor cor;

    //construtor!
    public FormaAbstrata(Cor cor) {
        this.cor = cor;
    }

    //getters and setters 
    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

}
