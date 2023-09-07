package FactoryMethod;

class WardhaStyleChoclateCake extends Cake
{
	WardhaStyleChoclateCake()
	{
		name = "Wardha Style choclate Cake";
		bread = "thick bread";
		choclate = "White Choclate";
	}
	void prepare()
	{
		System.out.println("preparing Wardha Style choclate cake");
	}
}
