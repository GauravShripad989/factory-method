package FactoryMethod;

class WardhaStyleBlackForestCake extends Cake
{
	WardhaStyleBlackForestCake()
	{
		name = "Wardha Style Black Forest Cake";
		bread = "thick bread";
		choclate = "white Choclate";
	}
	void prepare()
	{
		System.out.println("preparing Wardha Style Black Forest");
	}
}
