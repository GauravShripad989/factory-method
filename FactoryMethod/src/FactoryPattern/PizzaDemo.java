package FactoryPattern;

class PizzaDemo{
	public static void main(String[] args)
	{
		PizzaStore cs;
		cs = new WardhaPizzaStore();
		cs.order("wardha veggie pizza");

		PizzaStore cs1;
		cs1 = new NagpurPizzaStore();
		cs1.order("nagpur cheese pizza");
	}
}
