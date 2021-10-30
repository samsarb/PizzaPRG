
public enum DeliveryType {
	Bike(20),Motorcycle(50),Drone(80);
	
	public final int value;
	
	DeliveryType(int value){
		this.value=value;
	}
}
