package tns.classes.program.inheritance;


class Animal4{
	Animal4(){
		System.out.println("Animal Contructor");
	}
}

class Dog4 extends Animal4{
	Dog4(){
		//super();
		System.out.println("Dog Contructor");
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 d=new Dog4();
		
	}
}
