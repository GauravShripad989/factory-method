package FactoryPattern;

class WardhaCheesePizza extends Pizza
{
	WardhaCheesePizza()
	{
		name = "Wardha Cheese Pizza";
		bread = "thick bread";
		toping = "Lots of cheese";
	}
	void prepare()
	{
		System.out.println("preparing Wardha Cheese Pizza");
	}
}
