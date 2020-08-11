package inheritance_java;

public class B extends A {
	  int a;
	public static void main(String[] args) {
		B objB = new B();
		System.out.println(objB.deposit());
		System.out.println(objB.withdraw());
        //System.out.println(objB.a);
	}
	
	
}

/* constructor with no return type, that can be used to print the value assigned using the object of the class

public B() {
	a = 5;
	
}
*/