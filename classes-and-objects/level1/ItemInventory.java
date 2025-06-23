public class ItemInventory {
    int itemCode;
    String itemName;
    double price;
    ItemInventory(int itemCode, String itemName, double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    void displayAndTotalCost(int quantity){
        System.out.println("ItemCode:"+itemCode+"\nItem Name: "+itemName+"\nPrice (Per Unit): "+price );
        System.out.println("Price of "+quantity+" unit is:"+(quantity*price));
    }
}
