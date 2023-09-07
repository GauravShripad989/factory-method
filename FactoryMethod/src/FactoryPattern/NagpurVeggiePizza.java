package FactoryPattern;

class NagpurVeggiePizza extends Pizza
{
	NagpurVeggiePizza()
	{
		name = "Nagpur Veggie Pizza";
		bread = "thin bread";
		toping = "Lots of Veggie";
	}
	void prepare()
	{
		System.out.println("preparing Nagpur Veggie Pizza");
	}
}
