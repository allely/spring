package ch05.sec02.exam04.ex1;

public class Ex3StringArrayPrintExample {

	public static void main(String[] args) {
		String[] toppings =  {"Pepperoni", "Mushrooms",
				"Onions", "Sausage", "Bacon" };
		
		/*
		 * String topping[];
		 *topping = new String[] {"Pepperoni", "Mushrooms",
		 *					"Onions", "Sausage", "Bacon" };
		 */
		
		for(int i = 0; i < toppings.length; i ++) {
			System.out.print(toppings[i] + " ");
		}
	}
}
