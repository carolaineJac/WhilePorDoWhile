import java.util.Scanner;

public class SecuenciadeFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Parametro");

		int n = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int fib;
		int limite = 100;

		for (int i = 0; i < n; i++) {
			System.out.println(num1);

			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
		}

	}
}
