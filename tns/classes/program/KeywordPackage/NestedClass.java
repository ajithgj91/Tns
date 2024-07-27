package tns.classes.program.KeywordPackage;

class Outer{
	static int i=5;
	static class Inner{
		void display() {
			System.out.println("Display method in inner class");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o=new Outer();
		System.out.println(o.i);
		//o.new Inner().display();
		Outer.Inner i=new Outer.Inner();
		i.display();
	}

}
