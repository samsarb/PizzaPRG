
public class Cheese extends Ingredient{
	
	private int weight;

	@Override
	protected int getCost() {
		this.weight = weight;
		return 0;
	}

}
