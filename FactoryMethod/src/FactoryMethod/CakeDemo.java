package FactoryMethod;

class CakeDemo{
	public static void main(String[] arg)
	{
		CakelinksStore cs;
		cs = new WardhaCakelinksStore();
		cs.order("wardha choclate");

		CakelinksStore cs1;
		cs1 = new NagpurCakelinksStore();
		cs1.order("nagpur vanilla");
	}
}
