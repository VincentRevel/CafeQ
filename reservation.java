package CafeQJava;

import java.util.Scanner;

public class reservation {
    private payment payment = new payment();
    Scanner in = new Scanner(System.in);
    public reservation(){
    }

    public void makeReservation(cafe cafe, user user, int seatSelected, int timeSelected){
        if(cafe.getavailableSeat() == 0){
            System.out.println("Maaf kursi pada cafe ini sudah penuh");
        }else if(cafe.getavailableSeat() < seatSelected){
            System.out.println("Maaf kursi yang tersedia hanya : " + cafe.getavailableSeat() + "kursi");    
        }else{
            System.out.println("Apakah anda ingin memesan menu?");
            System.out.print("(Y/N) : ");
            String menuYN = in.nextLine().toLowerCase();
            if(menuYN.equals("y")){
                menu menuSelected =  cafe.showMenu();
                payment.startPayment(payment.getQuestion(), cafe, seatSelected, timeSelected, user, menuSelected);
            }else{
                payment.startPayment(payment.getQuestion(), cafe, seatSelected, timeSelected, user, null);
            }
        }
    }
}
