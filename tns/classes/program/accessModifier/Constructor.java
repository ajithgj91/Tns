package tns.classes.program.accessModifier;

public class Constructor {
	public Constructor() {
		System.out.println("Hello,World!");
	}
	
	public Constructor(int a,int b) {
		System.out.println("sum: "+a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj1=new Constructor();
		Constructor obj2=new Constructor(2,4);
	}

}
