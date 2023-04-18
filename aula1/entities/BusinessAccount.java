package entities;

public class BusinessAccount extends Account{
    //atributos
    private Double loanLimit;

    //construtor
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String name, Double balance, Double loanLimit){
        super(number, name, balance);
        this.loanLimit = loanLimit;
    }

    //getters and setters
    public Double getLoanLimit(){
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit){
        this.loanLimit = loanLimit;
    }

    //operação de empréstimo

    public void loan(Double amount){

            if (amount <= loanLimit){
                deposit(amount);
            }
            else {
                System.out.println("a solicitação ultrapassa seu limite de empréstimo: " + loanLimit);
            }
    }
}
