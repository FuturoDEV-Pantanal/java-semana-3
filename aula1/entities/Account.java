package entities;


//classe Account! a classe mais genérica deste programa :)
//SUPERCLASSE
public class Account {
    
    //atributos
    private Integer number;//numero da conta
    private String name; //titular da conta
    protected Double balance; //saldo //protected é um modificador que permite acessar da subclasse mas não de outras classes externas;


    //construtor padrão 
    public Account() {

    }
    
    //construtor com os argumentos
    public Account(Integer number, String name, Double balance){
        //a palavrinha mágica que insero o valor na variável do atributo vinculado ao objeto
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    //getters and setters
    //interface para nossos atributos restritos (privados)
    public Integer getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public Double getBalance(){
        return balance;
    }
    public void setNumber(Integer number){
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void withdraw(Double amount){
        balance -= amount;
    }
    public void deposit(Double amount){
        balance += amount;
    }
    

}
