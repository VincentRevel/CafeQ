package RPL;

import java.util.Scanner;

import javax.xml.transform.Source;

public class testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // String cell = in.nextLine();
        // String email = in.nextLine();
        // String password = in.nextLine();

        // Testing user
        user user1 = new user("Vincent", "081275226877", "vincent@gmail.com", "vincent123");
        // user user2 = new user(name, cell, email, password);

        // Testing Cafe
        cafeList cl = new cafeList();
        cafe cafe1 = new cafe("Poppys", "081275226673", "poppys@gmail.com", "poppys123");
        cafe cafe2 = new cafe("Nakoa", "089762543987", "nakoa@gmail.com", "nakoa123");
        cafe cafe3 = new cafe("Warunk WoW", "086578953627", "wow@gmail.com", "wow123");

        cafe1.setAddress("Jl. Candi Sari, no.24");
        cafe1.setReview("Harganya sesuai dengan kantong mahasiswa");
        cafe2.setAddress("Jl. Bondowoso, no.14");
        cafe2.setReview("Cafe premium !!!");
        cafe3.setAddress("Jl. MT. Haryono, No.2A");
        cafe3.setReview("Suasananya nyaman untuk produktif...");

        cafe1.addMenu("Americano", 999, 15000);
        cafe1.addMenu("Matcha", 999, 21000);
        cafe1.addMenu("Sandwich", 999, 12000);
        cafe2.addMenu("Americano", 999, 17000);
        cafe2.addMenu("Latte", 999, 22000);
        cafe2.addMenu("Chips", 999, 12500);
        cafe3.addMenu("Americano", 999, 14000);
        cafe3.addMenu("Espresso", 999, 8000);
        cafe3.addMenu("Burger", 999, 13000);

        cl.addCafe(cafe1);
        cl.addCafe(cafe2);
        cl.addCafe(cafe3);
        

        // Testing System
        int end = 0;
        while(end == 0){
            System.out.println("------------------------------------------------");
            System.out.println("LOGIN PAGE");
            System.out.println("------------------------------------------------");
            System.out.print("Masukkan email    : ");
            String emailInput = in.nextLine();
            System.out.print("Masukkan password : ");
            String passwordInput = in.nextLine();
            login start = new login();
            boolean x = start.loginUser(user1, emailInput, passwordInput);
            // Pengecekan Login User
            if(x == true){
                int exit = 0;
                while(exit == 0){
                    // Print Daftar Cafe
                    System.out.println("------------------------------------------------");
                    System.out.println("Daftar Cafe:");
                    cl.printList();
                    System.out.println("Transaksi = 99");
                    System.out.println("[Log Out = 0]");
                    System.out.print("Pilih cafe : ");
                    int cafeSelected = in.nextInt();
                    System.out.println("------------------------------------------------");
                    if(cafeSelected == 0){
                        System.out.println(user1.getName() + " logging out ...");
                        exit = 1;
                    }else if(cafeSelected == 99){
                        user1.showTransaksi();
                    }else if((cafeSelected-1) < cl.getSize()){
                        // Menampilkan informasi spesifik cafe yang dipilih
                        cl.spesificInformation(cafeSelected-1);
                        System.out.println("\nApakah anda ingin melakukan reservasi?(Y/N)");
                        System.out.print("Input : ");
                        String reservationInput = in.next();
                        if(reservationInput.toLowerCase().equals("y")){
                            reservation reserv = new reservation();
                            System.out.println("------------------------------------------------");
                            System.out.print("Jumlah Pengunjung : ");
                            int seatTotal = in.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Daftar Waktu yang tersedia");
                            cl.cafeL[cafeSelected-1].printTime();
                            System.out.print("Silahkan masukkan pilihan waktu reservasi : ");
                            int timeSelected = in.nextInt();
                            System.out.println("------------------------------------------------");
                            reserv.makeReservation(cl.cafeL[cafeSelected-1], user1, seatTotal, timeSelected-1);
                        }
                    }else{
                        System.out.println("Cafe yang anda pilih tidak tersedia.");
                    }
                }
            }else{
                System.out.println("------------------------------------------------");
                System.out.println("Email atau password yang anda input salah.");
            }
        }
        
    }
}
