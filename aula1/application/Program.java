package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args){
        

        //Instancia da classe mãe (superclasse)
        //instancia do objeto tipo Account
        Account acc = new Account(7878, "nome", 850000.55);
        
        //instância da classe filha (subclasse)
        //instancia do objeto tipo BusinessAccount
        BusinessAccount bacc = new BusinessAccount(7979, "nome2", 8955560.85, 89856.05);
        
        //instância da classe filha (subclasse)
        //instancia do objeto tipo SavingsAccount
        SavingsAccount sacc = new SavingsAccount(7777, "nome3", 9898.67, .5);


        
        //quando pinga a taxa na poupança;
        Double saldo1 = sacc.getBalance();
        System.out.println("saldo pré taxa: " + saldo1);

        sacc.updateBalance();

        Double saldo2 = sacc.getBalance();
        System.out.println("saldo pós taxa: "+ saldo2);

        System.out.println("Rendimento total do período"+ (saldo2-saldo1));





      
    }

}