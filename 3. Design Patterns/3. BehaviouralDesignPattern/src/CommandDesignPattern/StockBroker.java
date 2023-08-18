package CommandDesignPattern;

import java.util.LinkedList;
import java.util.List;

public class StockBroker {
	
	private List<Order> orderList = new LinkedList<>();
	
	public void placeOrder(Order order)
	{
		orderList.add(order);
	}
	
	public void executeOrder()
	{
		for(Order order: orderList)
		{
			order.execute();
		}
	}

}
