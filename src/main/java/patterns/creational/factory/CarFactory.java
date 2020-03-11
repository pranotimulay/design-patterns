package main.java.patterns.creational.factory;

public class CarFactory {

	static public Car getCar(String carType) {

		if (carType.equals("BMW")) {
			return new Bmw();
		}

		if (carType.equals("HONDA")) {
			return new Honda();
		}

		if (carType.equals("MERC")) {
			return new Mercedes();
		}

		return null;
	}

	public static void main(String[] args) {
		int a = 5, b = 3, y = 8;
		while (b <= y) {

			b = b * 2;
			
			System.out.println("b=" + b);
			y = a + 4;
			System.out.println("y=" + y);
			if (b < y) {
				b = a + y - 8;
				System.out.println("b=" + b);
			} else {
				b = 33 + a;
				System.out.println("b=" + b);
			}
		}
		a = b + 10;

		System.out.println(b);

	}

}
