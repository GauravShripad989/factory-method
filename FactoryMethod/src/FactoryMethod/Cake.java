package FactoryMethod;

abstract class Cake
{
	String name;
	String bread;
	String choclate;
	
	abstract void prepare();
	
	void bake(){System.out.println("Bake Cake");}
	void pack(){System.out.println("pack Cake");}
	void decorate(){System.out.println("decorate Cake");}
	
	void incredients(){
	System.out.println(name);
	System.out.println(bread);
	System.out.println(choclate);
	}
}
