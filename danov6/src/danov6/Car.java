package danov6;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {

	static Scanner s = new Scanner(System.in);

	private String model;
	private double price;
	private int year;

	public Car() {

	}

	public Car(String model, double price, int year) {

		this.model = model;
		this.price = price;
		this.year = year;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void input() {

		System.out.println("�������� ����� : ");
		String model = s.nextLine();
		System.out.println("�������� ���� : ");
		double price = Double.parseDouble(s.nextLine());
		System.out.println("�������� ������ �� ������������ : ");
		int year = Integer.parseInt(s.nextLine());
		int currentCar = 0;
		Cars.addCar(model, price, year);
		System.out.println(Cars.cars.get(currentCar).toString());
		currentCar++;
		
		model = null;
		price = 0;
		year = 0;

	}

	public static void delete(String model) {
		for(int i = 0; i < Cars.maxCars; i++) {
			if (model.equals(Cars.cars.get(i).getModel())) {
				Cars.cars.get(i);
			}
		}
	}

	public String toString() {
		return "����� : " + model + " | ���� : " + price + " | ������ �� ������������ : " + year;
	}

}
