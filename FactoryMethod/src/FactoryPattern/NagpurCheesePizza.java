package FactoryPattern;

class NagpurCheesePizza extends Pizza
{
	NagpurCheesePizza()
	{
		name = "Nagpur Cheese Pizza";
		bread = "thin bread";
		toping = "Lots of Cheese";
	}
	void prepare()
	{
		System.out.println("preparing Nagpur Cheese Pizza");
	}
}
