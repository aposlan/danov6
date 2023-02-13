package danov6;
import java.util.ArrayList;
public class Cars {
	
	public static ArrayList<Car> cars = new ArrayList<>();
	static int maxCars;
	
	public Cars() {
		
	}
	
	public static void add() {
		input();
		for(int i = 0; i < maxCars; i++) {
			Car.input();
		}	
		
	}
	
	public static void input() {	
		System.out.println("Въведете максимален брой коли : ");	
		maxCars = Integer.parseInt(Car.s.nextLine());
	}
	
	public String toString() {
		return cars.toString();
	}
	
	public static void addCar(String model, double price, int year) {
		cars.add(new Car(model, price, year));
	}
	
}
