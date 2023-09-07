package FactoryPattern;

class NagpurCornPizza extends Pizza
{
	NagpurCornPizza()
	{
		name = "Nagpur Corn Pizza";
		bread = "thin bread";
		toping = "Lots of corn";
	}
	void prepare()
	{
		System.out.println("preparing Nagpur Corn Pizza");
	}
}
