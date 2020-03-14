import java.util.Scanner;

public class SoloPares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Parametro");

		int n = sc.nextInt();
		int contador = 0;
		int suma = 0;
		do {
			contador += 1;
			suma += 2;
			System.out.println(suma);
			
		} while (contador < n);
		{
		}
	}
}
