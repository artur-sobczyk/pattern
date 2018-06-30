package pl.art.tutorial.pattern.builder.bloch.classical;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaBuilderDemo {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();

		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(spicyPizzaBuilder);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		log.info(pizza.toString());
	}
}
