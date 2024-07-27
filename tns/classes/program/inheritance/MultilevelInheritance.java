package tns.classes.program.inheritance;

class Animal2{
	void eat() {
		System.out.println("Animal");
	}
}

class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog");
	}
}

class Puppy extends Dog2{
	void weep() {
		System.out.println("puppy");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a=new Animal2();
		a.eat();
		
		Dog2 d=new Dog2();
		d.eat();
		d.bark();
		
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.weep();
		
		Animal2 a1 = new Dog2();
		Animal2 a2 = new Puppy();
		Dog2 d1 = new Puppy();

	}

}
