package danov6;

public class App {

	public static void main(String[] args) {

		Cars.add();
		System.out.println("������� �� �� ���������� ���� �� ����� �����? (y) yes | (n) no");
		String answer = Car.s.nextLine();

		switch (answer) {
		
		case "y":
			System.out.println("�������� ����� : ");
			String inputModel = Car.s.nextLine();
			Car.delete(inputModel);
			
		case "n":
			System.out.println("������ ���� : ");
			Cars.cars.toString();
			
		}

	}

}
