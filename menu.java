package RPL;

import java.util.ArrayList;

public class menu {
    // public ArrayList<String> menu = new ArrayList<String>();
    private String name;
    private int stock;
    private float price;

    public menu(String name, int stock, float price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void printMenu(){
        System.out.println(this.name + ", Rp. " + this.price);
    }

    public String getName() {
      return this.name;
    }
    public void setName(String value) {
      this.name = value;
    }

    public int getStock() {
      return this.stock;
    }
    public void setStock(int value) {
      this.stock = value;
    }

    public float getPrice() {
      return this.price;
    }
    public void setPrice(float value) {
      this.price = value;
    }
}
