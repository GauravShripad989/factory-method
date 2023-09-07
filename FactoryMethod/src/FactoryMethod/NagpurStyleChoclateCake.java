package FactoryMethod;

class NagpurStyleChoclateCake extends Cake
{
	NagpurStyleChoclateCake()
	{
		name = "Nagpur Style choclate Cake";
		bread = "thin bread";
		choclate = "Dark Choclate";
	}
	void prepare()
	{
		System.out.println("preparing Nagpur Style choclate cake");
	}
}
