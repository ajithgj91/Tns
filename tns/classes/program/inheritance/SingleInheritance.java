package tns.classes.program.inheritance;

class Animal1{
	void eat() {
		System.out.println("Animal");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Animal1 a=new Animal1();
		a.eat();
		
		Dog1 d=new Dog1();
		d.eat();
		d.bark();
		
		Animal1 a1=new Dog1();
		a1.eat();

	}

}
