package CommandDesignPattern;

public class Stock {
	private String stockName;
	private int stockPrice;
	
	public Stock(String name,int price)
	{
		this.stockName = name;
		this.stockPrice = price;
	}
	
	public void buyStock()
	{
		System.out.println("Buing Stock of " + this.stockName + " at " + this.stockPrice + " Rs Per Share.");
	}
	
	public void sellStock()
	{
		System.out.println("Selling Stock of " + this.stockName + " at " + this.stockPrice + " Rs Per Share.");
	}
	
}
