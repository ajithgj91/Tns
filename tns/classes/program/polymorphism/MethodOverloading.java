package tns.classes.program.polymorphism;


class Adder{
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(float a,float b) {
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder ad=new Adder();
		System.out.println(ad.add(4.2f,9.2f));
		
	}

}
