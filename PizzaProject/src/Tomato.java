
public class Tomato extends Vegetable{
	
	
	private int weight;
	
	
	public Tomato(int weight) {
		this.weight = weight;
	}
	
	@Override
	protected int getCost() {
		
		return this.weight*12 ;
	}

}
