
public class Drink extends OrderItem{
	
	private String drinkName;
	private int valume;
	private boolean carbonated;
	
	
	public Drink(String drinkName, int valume, boolean carbonated) {
		this.drinkName = drinkName;
		this.valume = valume;
		this.carbonated = carbonated;
	}

	@Override
	protected int getCost() {
		int price = this.valume * 2;
		if(this.carbonated) {
			price+=40;
		}
		return price;
	}
	
	

}
