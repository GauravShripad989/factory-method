package FactoryPattern;

class WardhaCornPizza extends Pizza
{
	WardhaCornPizza()
	{
		name = "Wardha Corn Pizza";
		bread = "thick bread";
		toping = "Lots of corn";
	}
	void prepare()
	{
		System.out.println("preparing Wardha Corn Pizza");
	}
}
