package FactoryMethod;

class NagpurStyleBlackForestCake extends Cake
{
	NagpurStyleBlackForestCake()
	{
		name = "Nagpur Style Black Forest Cake";
		bread = "thin bread";
		choclate = "Dark Choclate";
	}
	void prepare()
	{
		System.out.println("preparing Nagpur Style Black Forest");
	}
}
