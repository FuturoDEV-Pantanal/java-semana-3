package aula_3.revisao_a.program;

import java.util.ArrayList;
import java.util.Scanner;

import aula_3.revisao_a.entities.Funcionario;
import aula_3.revisao_a.entities.FuncionarioTerc;

public class Programa {

    public static void main(String [] args) {
        
        //lista de funcionarios
        ArrayList<Funcionario> lista = new ArrayList<>();

        //Scanner para conversar com o usuário pelo terminal
        Scanner scanner = new Scanner(System.in);

        //inicio da interação com usuário
        System.out.println("Seja bem vindo a sua calculadora mensal de pagamentos");
        System.out.println("Quantos funcionários irá calcular?");
        int n = scanner.nextInt();
        scanner.nextLine();

        //loop de cadastro de informações para o calculo da folha de pagamento

        for (int i=1; i<=n; i++){
            System.out.println("Funcionario #" + i + "Dados:");
            System.out.println("Funcionario terceirizado? [y/n]");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();

            //coleta dados funcionario
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Valor por hora: ");
            Double valor = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Horas trabalhadas: ");
            Integer horas = scanner.nextInt();
            scanner.nextLine();

            //para funcionarios terceirizados
            if (ch == 'y') {

                System.out.print("Despesa Adicional : ");
                Double despesaAdicional = scanner.nextDouble();

                FuncionarioTerc funcionarioTerc = new FuncionarioTerc(nome, horas, valor, despesaAdicional);
                lista.add(funcionarioTerc);                
            }
            //funcionário nao terceirizado
            else {

                Funcionario funcionario = new Funcionario(nome, horas, valor);
                lista.add(funcionario); 
            }


        }
        scanner.close();        
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.getNome() + " | " + funcionario.pagamento());
        }



    }

    
}
