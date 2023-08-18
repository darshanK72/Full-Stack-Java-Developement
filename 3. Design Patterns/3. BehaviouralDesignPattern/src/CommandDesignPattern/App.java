package CommandDesignPattern;

public class App {

	public static void main(String[] args) {
		
		StockBroker broker = new StockBroker();
		
		Stock stock1 = new Stock("TCS",100);
		Stock stock2 = new Stock("MRF Tyres",120);
		Stock stock3 = new Stock("Tesla",2030);
		Stock stock4 = new Stock("BYJUS",52);
		Stock stock5 = new Stock("Wipro",623);
		
		broker.placeOrder(new PurchaseOrder(stock1));
		broker.placeOrder(new PurchaseOrder(stock2));
		broker.placeOrder(new PurchaseOrder(stock3));
		broker.placeOrder(new PurchaseOrder(stock4));
		broker.placeOrder(new SellOrder(stock5));
		broker.placeOrder(new SellOrder(stock2));
		
		
		broker.executeOrder();
		
	}

}
