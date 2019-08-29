package oop;

public class Bmw extends Car {

		
    Car car = new Car();
    public int getHorsePower() {
    	int hp =horsepower;
    	return hp;
    	}
    public void testMethodBmw() {
    	testMethodCars();
    	System.out.println("from bmw");
    }
   public static void main (String[] args) {
   Bmw bmw =new Bmw();
  int store= bmw.getHorsePower();
   System.out.println(  store + 123);
   System.out.println(store);
   bmw.testMethodBmw();
   bmw.testMethodCars();


}
}
