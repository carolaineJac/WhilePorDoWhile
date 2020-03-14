import java.util.Scanner;

public class Sumaimparlimite {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Limite Inferior");
		int min = sc.nextInt();
		System.out.println("Ingrese Limite Superior");
		int max = sc.nextInt();
		int suma = 0;

		min = min + 1;

		while (min < max) {
			if (min % 2 == 1) {
				suma += min;
			}
			min += 1;
		}

		System.out.println(suma);
	}
}
