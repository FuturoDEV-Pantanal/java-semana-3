package aula_3.modificadores.entities;

public class Cachorro extends Animal {

    private String raca;
    
    public Cachorro(String nome, String especie, int idade, String raca){
        super(nome, especie, idade);
        this.raca = raca;
    }

    //getters and setters

    public void atualizaIdade(){
        this.idade += 1;
    }
    
    @Override
    public void printInfo(){
        System.out.println("======================================");
        System.out.println("\tNome do Cachorro: "+ nome);
        System.out.println("\tIdade do Cachorro: "+ idade);
        System.out.println("\tEspécie do Cachorro: "+ especie);
        System.out.println("\tRaça do Cachorro: "+ raca);
        System.out.println("======================================");
    }

}
