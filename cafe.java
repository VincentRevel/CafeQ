package CafeQJava;

import java.util.ArrayList;
import java.util.Scanner;

public class cafe {
    private String email, password, name, address, review, photo, cell;
    private float rating;
    private int availableSeat = 30;
    private int size = 0;
    public invoice inv = new invoice();
    public ArrayList<String> timeAvailable = new ArrayList<String>();
    public ArrayList<menu> menu = new ArrayList<menu>();
    Scanner in = new Scanner(System.in);
    
    public cafe(){
        
    }

    public cafe(String name, String cell, String email, String password) {
        this.name = name;
        this.cell = cell;
        this.email = email;
        this.password = password;
        // Generate Time
        for(int i = 0; i < 9; i++){
            timeAvailable.add(i, ("0" + (i+1) + ":00"));
        }
        size++;
    }

    public cafe(String address, String review, String photo) {
        this.address = address;
        this.review = review;
        this.photo = photo;
    }

    public boolean login(String email, String password) {
        if (email.equals(this.email) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    public void printTime(){
        for(int i = 0; i < timeAvailable.size(); i++){
            System.out.println("[" + (i+1) + "]. " + timeAvailable.get(i));
        }
    }
    
    public String getTimeSelected(int index){
        return timeAvailable.get(index);
    }

    public void updateTime(int timeReserved){
        this.timeAvailable.remove(timeReserved);
    }

    public void updateSeat(int seatReserved){
        this.availableSeat -= seatReserved;
    }

    public void setInvoice(String invoiceID, String time, boolean paymentStatus, cafe cafe, int seat, menu menuSelected){
        inv = new invoice(invoiceID, time, paymentStatus, cafe, seat, menuSelected);
    }

    public void addMenu(String name, int stock, float price){
        menu.add(new menu(name, stock, price));
    }

    public menu showMenu(){
        System.out.println("------------------------------------------------");
        if(menu.size() == 0){
            System.out.println("No menu available");
            System.out.println("------------------------------------------------"); 
            return null;
        }else{
            for(int i = 0; i < menu.size(); i++){
                System.out.println("Menu [" + (i+1) + "]");
                menu.get(i).printMenu();
            }
            return menu.get(this.userIndexMenu());
        }
    }

    public int userIndexMenu(){
        System.out.print("\nSilahkan memasukkan index menu yang diinginkan : ");
        int index = in.nextInt();
        System.out.println("------------------------------------------------");        
        return index-1;
    }

    // Setter Getter Methods
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public int getavailableSeat() {
        return availableSeat;
    }
    public void setavailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }
}
