package CafeQJava;

import java.util.ArrayList;

public class user {
    private String name, cell, email, password ;
    public invoice inv;
    public ArrayList<invoice> invoiceList = new ArrayList<invoice>(); 
    
    public user(String name, String cell, String email, String password) {
        this.name = name;
        this.cell = cell;
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        if (email.equals(this.email) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    public void makeInvoice(cafe cafe, int seatSelected, int timeSelected, menu menuReserved){
        invoiceList.add(new invoice(("01948")+seatSelected, cafe.getTimeSelected(timeSelected), true, cafe, seatSelected, menuReserved));
        inv = invoiceList.get(invoiceList.size()-1);
    }

    public void showTransaksi(){
        if(invoiceList.size() == 0){
            System.out.println("Anda belum pernah melakukan transaksi . . .");
        }else{
            for(int i = 0; i < invoiceList.size(); i++){
                invoiceList.get(i).displayInvoice();
            }
        }
        
    }

    // Setter getter method
    public String getName() {
        return name;
    }
    public String getCell() {
        return cell;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCell(String cell) {
        this.cell = cell;
    }
    public void setName(String name) {
        this.name = name;
    }

}
