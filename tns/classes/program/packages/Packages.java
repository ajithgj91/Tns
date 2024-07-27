package tns.classes.program.packages;

public class Packages {

	public int a=4;
	private int b=5;
	protected int c=6;
	int d=7;
	
	public int method(int a,int b) {
		this.a=a;
		this.b=b;
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packages obj=new Packages();
		System.out.println("sum: "+obj.method(2, 3));
	}

}
