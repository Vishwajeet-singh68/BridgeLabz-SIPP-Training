
public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice=129;
        int sellingPrice=191;
        int profit=sellingPrice-costPrice;
        double profitPercent=(profit*1.0/costPrice)*100;
	    System.out.println("The Cost price in INR "+costPrice+" and selling Price is INR "+sellingPrice+
				"\nThe Profit is INR "+profit+" and the profit Percentage is " + profitPercent);
    }
}
