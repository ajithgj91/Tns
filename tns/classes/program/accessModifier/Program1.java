package tns.classes.program.accessModifier;
import tns.classes.program.packages.Packages;

public class Program1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Hello, world");
		System.out.println("packages,contructor and access modifier");
		
		Packages obj=new Packages();
		int result=obj.method(5, 6);
		System.out.println("result:"+result);
		
		System.out.println("a: "+obj.a);
		//System.out.println("b: "+obj.b);
		//System.out.println("c: "+obj.c);
		//System.out.println("d: "+obj.d);
	}

}
