
public class MainClass {

	public static void main(String[] args) {

		Order order1 = new Order (DeliveryType.Motorcycle);
		order1.addItemToOrder(new Drink("coca",200, true));
				
		Pizza pizza1 = new Pizza("chicken and mushroom", PizzaSize.Large);		
		pizza1.addIngredientToPizz(new Cheese(50));
		pizza1.addIngredientToPizz(new Tomato(80));
		pizza1.addIngredientToPizz(new Mushroom (80, false));
		pizza1.addIngredientToPizz(new Chicken(150));
		order1.addItemToOrder(pizza1);
		
		Pizza pizza2 = new Pizza("Peperoni",PizzaSize.Mini);
		pizza2.addIngredientToPizz(new ChickenHam(100));
		order1.addItemToOrder(pizza2);
		
		System.out.println("price of your oedre: " + order1.calcOrderCost());
		
	}

}
