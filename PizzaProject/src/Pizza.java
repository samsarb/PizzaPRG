import java.util.List;
import java.util.ArrayList;

public class Pizza extends OrderItem {
	private int basePrice = 8;
	private String pizzaName;
	private PizzaSize pizzaSize;		
	private List<Ingredient> ingredients; 
	
	
public Pizza(String pizzaName, PizzaSize pizzaSize) {
	pizzaName = pizzaName;
	this.pizzaSize = pizzaSize;
	ingredients=new ArrayList<>();
}

public void addIngredientToPizz(Ingredient ingredient) {
	ingredients.add(ingredient);
}


	
	@Override
protected int getCost() {
		int sum = 0;
		sum+=basePrice;
		for (Ingredient : ingredients) {
			
		}
		return 0;
}

}
