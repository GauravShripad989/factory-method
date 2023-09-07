package FactoryPattern;

class WardhaVeggiePizza extends Pizza
{
	WardhaVeggiePizza()
	{
		name = "Wardha Veggie Pizza";
		bread = "thick bread";
		toping = "Lots of Veggie";
	}
	void prepare()
	{
		System.out.println("preparing Wardha Veggie Pizza");
	}
}
