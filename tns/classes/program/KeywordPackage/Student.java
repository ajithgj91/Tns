package tns.classes.program.KeywordPackage;

public class Student {
	int usn=1;
	String name="rohit";
	static String college="JSSATEB";
	
	static void change() {
		college="jss";
	}
	@Override
	public String toString() {
		return "Student Name:"+name+"\nStudent Usn:"+usn+"\nStudent College:"+college;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		change();
		Student.change();
		s1.change();
		System.out.println(s1);
	}
}
