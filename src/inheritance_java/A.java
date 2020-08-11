package inheritance_java;

public class A {
	public static void main(String[] args) {
	 A objA = new A();
	 System.out.println("Deposit is " +  objA.deposit());
	 System.out.println("Withdraw is " +  objA.withdraw());
	}
	 
	public int deposit () {
		int deposit=5000;
		return deposit;
}
	public int withdraw() {
		int withdraw = 2000;
		return withdraw;
		
	}
}
