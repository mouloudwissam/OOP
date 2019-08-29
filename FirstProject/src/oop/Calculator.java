package oop;

public class Calculator {
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int multiply(int a,int b,int c) {
		return a*b*c;
}
	public static String multiply1(String d,int D) {
		return d+D;
	}
public static void main(String[] args) {
	int x = multiply(1,4);
	int y = multiply(12, 3,7);
	String z =multiply1("I HATE JAVA",5);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z +" "+x*y);
}
}
