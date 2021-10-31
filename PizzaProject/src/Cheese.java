
public class Cheese extends Ingredient{
	
	private int weight;
	
	public Cheese(int weight) {
        this.weight = weight;
    }

	@Override
	protected int getCost() {
		this.weight = weight;
		return 0;
	}

}
