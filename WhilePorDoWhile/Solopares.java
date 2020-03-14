import java.util.Scanner;

public class Solopares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Parametro");
		int n = sc.nextInt();
		int contador = 0;
		int suma = 0;
		do {
			System.out.println(suma);
			contador += 1;
			suma += 2;
		} while (contador < n);
		{
		}
	}
}