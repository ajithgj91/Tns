package tns.classes.program.inheritance;
class Animal{
	String color="Brown";
	void eat() {
		System.out.println("Eating");
	}
}


class Dog extends Animal{
	String color="White";
	void eat() {
		System.out.println("Eating Meat");
	}
	void call() {
		System.out.println(color);
		System.out.println(super.color);
		super.eat();
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		System.out.println(d.color);
		d.call();
		
		System.out.println();
		
		Animal a=new Dog();
		System.out.println(a.color);

	}

}
