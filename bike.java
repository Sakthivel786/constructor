package practise;

public class bike {
	String name;
	String model;
	double price;
bike(){
}
bike(String name,String model){
	this.name=name;
	this.model =model;
	
}
bike(String name,String model,double price){
	this.name=name;
	this.model=model;
	this.price=price;
		
	
}
public static void main(String[] args) {
	bike ref=new bike();
	bike ref2=new bike("ninja","zx10r");
	bike ref3=new bike("yamaha","r3",200000);	
	System.out.println(ref2.name);
	System.out.println(ref2.model);
	System.out.println(ref3.model);
	System.out.println(ref3.price);
	System.out.println(ref.price);
	
}
}

