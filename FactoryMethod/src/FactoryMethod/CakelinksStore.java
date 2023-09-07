package FactoryMethod;

abstract class CakelinksStore
{
	Cake c;
	void order(String type)
	{	
		c=createCake(type);
		c.bake();
		c.decorate();
		c.pack();
		c.incredients();
	}
	
	abstract Cake createCake(String type);
}
