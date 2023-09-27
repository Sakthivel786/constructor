package practise;

public class mobile {
	String name;
	String color;
	int price;
	
	//const
	mobile(){
	//l.i
	}
	mobile(String name){
		this.name=name;
	}
	mobile(String name,String color){
		this.name=name;
		this.color=color;
	}
	mobile(String name,String color,int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
public void text() {
	System.out.println("texting from "+name);
	
}
public void call() {
	System.out.println("call from "+name);
	
}
public static void main(String[] args) {
	mobile ref1=new mobile("nokia","black",15000);
	mobile ref2=new mobile("iphone","green",120000);
	ref1.text();
	ref1.call();
	ref2.call();
	ref2.text();
}
}
