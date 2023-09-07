package FactoryMethod;

class NagpurStyleVanillaCake extends Cake
{
	NagpurStyleVanillaCake()
	{
		name = "Nagpur Style vanilla Cake";
		bread = "thin bread";
		choclate = "Dark Choclate";
	}
	void prepare()
	{
		System.out.println("preparing Nagpur Style vanilla cake");
	}
}
