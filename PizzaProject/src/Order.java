import java.util.ArrayList;
import java.util.List;

public class Order {
	
	DeliveryType deliveryType;
	
	List<OrderItem> orderItems = new ArrayList<>();
	
	
	public Order(DeliveryType deliveryType) {
		this.deliveryType=deliveryType;
	}
	
	public void addItemToOrder(OrderItem item) {
		orderItems.add(item);
	}
	
	
	public int calcOrderCost() {
		int sum=deliveryType.value;
		for (OrderItem item:orderItems) {
			sum+=item.getCost();
		}
		if (sum>80) {
			sum -=0.1*sum; 
		}
		return sum;
	}
	
	
}
