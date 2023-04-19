package entities;
            //conta poupança
            //uma SUBCLASSE de Account
public class SavingsAccount extends Account{
    //atributos    
    private Double interestRate;

    //construtor;
    public SavingsAccount(){
        super();
    }

    //construto específico - com argumentos.
    public SavingsAccount(Integer number, String name, Double balance, Double interestRate){
        super(number, name, balance);
        this.interestRate = interestRate;
    }


    //getters and setters
    public Double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(Double interestRate){
        this.interestRate = interestRate;
    }

    public double interestRateExecution(){
       return balance * interestRate / 100;
    }
    
    public void updateBalance(){
        balance += interestRateExecution();
    }
    

}
