package aula_3.modificadores.entities;


public class Animal {

    //atributo disponível dentro do pacote
    protected String nome; 
    protected String especie;
    protected int idade;

    //construtor
    public Animal(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getNome(){
        return nome;
    }
    
    public void interfacePrintInfo(){
        printInfo();
    }

    private void printInfo(){
        System.out.println("======================================");
        System.out.println("\tNome do Animal: "+ nome);
        System.out.println("\tIdade do Animal: "+ idade);
        System.out.println("\tEspécie do Animal: "+ especie);
        System.out.println("======================================");
    }





    
}
