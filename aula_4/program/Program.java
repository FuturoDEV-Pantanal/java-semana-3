package aula_4.program;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import aula_4.entities.Reserva;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try { 
            //leitura dos dados
            System.out.println("Insira os dados da reserva");
            System.out.println("Número do Quarto: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Data Check-in: ");
            Date checkIn = sdf.parse(sc.next());
            sc.nextLine();
            System.out.println("Data Check-out: ");
            Date checkOut = sdf.parse(sc.next());
            sc.nextLine();
            Reserva reserva = new Reserva(n, checkIn, checkOut);
            System.out.println("Resumo Da Reserva: "+reserva.DisplayReserva());


           
            //update da reserva
            System.out.println();
            System.out.println("Insira as novas datas para update da reserva");
            System.out.println("Data Check-in (dd/MM/yyyy): ");
            Date checkInUpdate = sdf.parse(sc.next());
            sc.nextLine();
            System.out.println("Data Check-out (dd/MM/yyyy): ");
            Date checkOutUpdate = sdf.parse(sc.next());
            sc.nextLine();
            reserva.updateDatas(checkInUpdate, checkOutUpdate);
            System.out.println("Resumo Da Reserva: "+reserva.DisplayReserva());
        }
        catch (ParseException e) {

            System.out.println("Data Inválida" + e.getMessage());

        }

        catch (IllegalArgumentException e) {

            System.out.println("Erro na Reserva" + e);

        }
    

        sc.close();


    }

    
}
