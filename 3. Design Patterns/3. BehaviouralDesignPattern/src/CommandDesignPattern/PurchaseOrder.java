package CommandDesignPattern;

public class PurchaseOrder implements Order{
	
	private Stock stock;
	
	PurchaseOrder(Stock stock)
	{
		this.stock = stock;
	}

	@Override
	public void execute() {
		this.stock.buyStock();
	}

}
