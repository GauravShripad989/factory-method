package FactoryPattern;

class WardhaPizzaStore extends PizzaStore
{
	Pizza createPizza(String type)
	{
		if(type.equalsIgnoreCase("Wardha Cheese Pizza"))
		{
			c = new WardhaCheesePizza();
		}else if(type.equalsIgnoreCase("Wardha Veggie Pizza"))
		{
			c = new WardhaVeggiePizza();
		}else if(type.equalsIgnoreCase("Wardha Corn Pizza"))
		{
			c = new WardhaCornPizza();
		}
		return c;
	}
}
