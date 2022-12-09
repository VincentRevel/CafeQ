package RPL;


import java.util.Scanner;

public class payment {
    // private String [] paymentMethodList = {"Gopay", "DANA", "Q-ris"};
    private int answer = 2 * 2;
    Scanner in = new Scanner(System.in);

    public payment(){}

    public void startPayment(int userAnswer, cafe cafe, int seatSelected, int timeSelected, user user, menu menuSelected){
        if(userAnswer == answer){
            System.out.println("------------------------------------------------");
            System.out.println("Payment Success!");
            cafe.updateSeat(seatSelected);
            cafe.updateTime(timeSelected);
            user.makeInvoice(cafe, seatSelected, timeSelected, menuSelected);
            System.out.println("------------------------------------------------");

        }else{
            System.out.println("Payment Unsuccessful!");
        }
    }

    // public void printMethod(){
    //     for(int i = 0; i < paymentMethodList.length; i++){
    //         System.out.println("[" + (i+1) + "]. " + paymentMethodList[i]);
    //     }
    // }

    public int getQuestion(){
        System.out.println("--- PEMBAYARAN ---");
        System.out.println("Questtion : 2 x 2 = ?");
        System.out.print("Answer : ");
        int userAnswer = in.nextInt();
        return userAnswer;
    }

}
