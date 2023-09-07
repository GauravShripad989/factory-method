package FactoryPattern;

abstract class PizzaStore
{
	Pizza c;
	void order(String type)
	{	
		c=createPizza(type);
		c.bake();
		c.decorate();
		c.pack();
		c.incredients();
	}
	
	abstract Pizza createPizza(String type);
}
