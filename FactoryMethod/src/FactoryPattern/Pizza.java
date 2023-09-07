package FactoryPattern;

abstract class Pizza
{
	String name;
	String bread;
	String toping;
	
	abstract void prepare();
	
	void bake(){System.out.println("Pizza is in process");}
	void pack(){System.out.println("Pizza is packed");}
	void decorate(){System.out.println("Adding extra topings");}
	
	void incredients(){
	System.out.println(name);
	System.out.println(bread);
	System.out.println(toping);
	}
}
