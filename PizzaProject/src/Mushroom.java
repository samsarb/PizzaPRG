
public class Mushroom extends Vegetable {
	
	
	private int wieght;
	private boolean canned;
	
	
	public Mushroom (int weight , boolean canned) {
		this.wieght = weight;
		this.canned = canned;
	}

	@Override
	protected int getCost() {
		
		int price = this.wieght *3;
		if(!canned) {
			price*=2;			
		}
		
		return price;
	}

}
