package FactoryMethod;

class WardhaStyleVanillaCake extends Cake
{
	WardhaStyleVanillaCake()
	{
		name = "Wardha Style vanilla Cake";
		bread = "thick bread";
		choclate = "White Choclate";
	}
	void prepare()
	{
		System.out.println("preparing Wardha Style vanilla cake");
	}
}
