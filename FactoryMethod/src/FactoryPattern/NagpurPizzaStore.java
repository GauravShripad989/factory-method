package FactoryPattern;

class NagpurPizzaStore extends PizzaStore
{
	Pizza createPizza(String type)
	{
		if(type.equalsIgnoreCase("Nagpur Cheese Pizza"))
		{
			c = new NagpurCheesePizza();
		}else if(type.equalsIgnoreCase("Nagpur Veggie Pizza"))
		{
			c = new NagpurVeggiePizza();
		}else if(type.equalsIgnoreCase("Nagpur Corn Pizza"))
		{
			c = new NagpurCornPizza();
		}
		return c;
	}
}
