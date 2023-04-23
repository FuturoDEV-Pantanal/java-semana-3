package aula_4.entities;


import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class Reserva {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    //formato de data que vamos trabalhar
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut){
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto(){
        return numeroQuarto;
    }
    
    public Date getCheckIn(){
        return checkIn;
    }
    public Date getCheckOut(){
        return checkOut;
    }

    public void setNumeroQuarto(Integer numeroQuarto){
        this.numeroQuarto = numeroQuarto ;
    }
    
    public void setCheckIn(Date checkIn){
        this.checkIn = checkIn ;
    }
    public void setCheckOut(Date checkOut){
        this.checkOut = checkOut ;
    }

    public Long duracao(){
        Long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void updateDatas(Date checkIn, Date checkOut){
        Date now = new Date();

        //checagem da validade dos inputs de Data. checkIn checkOut.
        //Controle de exceção no valor de date.
        if (checkIn.before(now) || checkOut.before(now)){
            throw new IllegalArgumentException("As datas estão equivocadas, precisam ser no futuro.");
        }

        //controle de exceção segunda camada.
        if (!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Checkout precisa ser depois do dia do check-in");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String DisplayReserva(){

        return "Quarto, número: " 
                + numeroQuarto
                + "Check-In: "
                + checkIn
                + "Check-out: "
                + checkOut
                + "Duração da reserva: "
                + duracao()
                + "noites";


    }



    
}
