package fibonache;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonache {

	public static void main(String[] args) {
		long res = 0;
		long b = 1;
		long c = 0;
		System.out.println("какое число Фибоначе найти");
		int a = 0;
		try {
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			scan.close();
			for (int i = 1; i <= a; i++) {
				c = res;
				res += b;
				b = c;
			}
			System.out.println(res);
		} catch (InputMismatchException e) {
			System.out.println("Введено дробное число");

		}
	}

}
