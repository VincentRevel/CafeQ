package RPL;

public class invoice {
    private String invoiceID, time;
    private boolean paymentStatus;
    private cafe cafeReserv;
    private int num = 1238;
    private int seatTotal;
    private String menuName;
    private float menuPrice;

    public invoice(){
    }

    public invoice(String invoiceID, String time, boolean paymentStatus, cafe cafe, int seat, menu menu){
        this.invoiceID = invoiceID;
        this.time = time;
        this.paymentStatus = paymentStatus;
        this.cafeReserv = cafe;
        this.seatTotal = seat;
        this.menuName = menu.getName();
        this.menuPrice = menu.getPrice();
        this.displayInvoice();
    }

    public void displayInvoice(){
        System.out.println("Invoice ID     : " + invoiceID);
        System.out.println("Cafe           : " + cafeReserv.getName());
        System.out.println("Total Seat     : " + seatTotal + " seat");
        System.out.println("Time           : " + time);
        if(menuName != null){
            System.out.println("Menu Name      : " + menuName);
            System.out.println("Total Price    : Rp. " + (menuPrice * seatTotal));
        }
        if(paymentStatus == true){
            System.out.println("Payment Status : Sudah Dibayar" );
        }else{
            System.out.println("Payment Status : Belum Dibayar" );
        }
    }

    public String getinvoiceID() {
        return invoiceID;
    }
    public void setinvoiceID(String invoiceID) {
        this.invoiceID = "" + num++;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public boolean isPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public cafe getCafeReserv() {
        return cafeReserv;
    }
}
