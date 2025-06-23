public class Mobiles{
    String brand;
    String model;
    double price;
    Mobiles(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display(){
        System.out.println("Brand: "+brand+"\nModel:"+model+"\nPrice:"+price);
    }
}