package tns.classes.program.abstraction;

public abstract class AbstractMethods {
	AbstractMethods(){
		System.out.println("abstract constructor");
	}
	abstract void run();
	static void speed() {
		System.out.println("Speed Method");
	}
	
}

class Subclass extends AbstractMethods{
	Subclass(){
		System.out.println("implement constructor");
	}
	
	void run() {
		System.out.println("run Method");
	}
}
