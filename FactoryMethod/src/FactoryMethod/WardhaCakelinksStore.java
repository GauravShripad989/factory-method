package FactoryMethod;

class WardhaCakelinksStore extends CakelinksStore
{
	Cake createCake(String type)
	{
		if(type.equalsIgnoreCase("Wardha BlackForest"))
		{
			c = new WardhaStyleBlackForestCake();
		}else if(type.equalsIgnoreCase("Wardha Vanilla"))
		{
			c = new WardhaStyleVanillaCake();
		}else if(type.equalsIgnoreCase("Wardha Choclate"))
		{
			c = new WardhaStyleChoclateCake();
		}
		return c;
	}
}
