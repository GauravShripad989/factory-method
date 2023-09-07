package FactoryMethod;

class NagpurCakelinksStore extends CakelinksStore
{
	Cake createCake(String type)
	{
		if(type.equalsIgnoreCase("Nagpur BlackForest"))
		{
			c = new NagpurStyleBlackForestCake();
		}else if(type.equalsIgnoreCase("Nagpur Vanilla"))
		{
			c = new NagpurStyleVanillaCake();
		}else if(type.equalsIgnoreCase("Nagpur Choclate"))
		{
			c = new NagpurStyleChoclateCake();
		}
		return c;
	}
}
