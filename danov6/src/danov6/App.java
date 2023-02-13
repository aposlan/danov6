package danov6;

public class App {

	public static void main(String[] args) {

		Cars.add();
		System.out.println("Желаете ли да премахнете коли по даден модел? (y) yes | (n) no");
		String answer = Car.s.nextLine();

		switch (answer) {
		
		case "y":
			System.out.println("Изберете модел : ");
			String inputModel = Car.s.nextLine();
			Car.delete(inputModel);
			
		case "n":
			System.out.println("Вашите коли : ");
			Cars.cars.toString();
			
		}

	}

}
