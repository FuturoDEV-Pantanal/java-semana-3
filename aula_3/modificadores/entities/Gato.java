package aula_3.modificadores.entities;

public class Gato extends Animal {

    protected String cor;

    public Gato(String nome, String especie, int idade, String cor){
        super(nome, especie, idade);
        this.cor = cor;
    }

    //getters and setters

    public void alteraNome(String nome){
       //utilizamos this porque é atributo do objeto criado via construtor.
       this.nome = nome;
    }

    @Override
    public void interfacePrintInfo(){
        printInfo();
    }

    private void printInfo(){
        System.out.println("======================================");
        System.out.println("\tNome do Gato: "+ nome);
        System.out.println("\tIdade do Gato: "+ idade);
        System.out.println("\tEspécie do Gato: "+ especie);
        System.out.println("\tCor do Gato: "+ cor);
        System.out.println("======================================");
    }



}
