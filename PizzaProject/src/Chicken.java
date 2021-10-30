
public class Chicken extends Meat{
	
	
	private int weight;
	
	
	public Chicken(int weight) {
		this.weight = weight;
	}

	@Override
	protected int getCost() {
		return this.weight * 45;
	}

}
