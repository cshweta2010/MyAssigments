package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		callCalculator();
	}
	public static void callCalculator() {
		Calculator c = new Calculator();
		int add = c.add(5, 20, 10);
		System.out.println("addition is " + add);
		
		System.out.println("Multiply is " + c.mul(5, 20));
		
		c.sub(30, 10);
	}

}
