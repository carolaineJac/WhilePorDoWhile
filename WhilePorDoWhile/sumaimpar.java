import java.util.Scanner;
public class Sumaimpar {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Parametro");
		int n =sc.nextInt();
		int contador = 0;
		int suma = 1;
		int total = 0;
		do {
			contador +=1;
			total = total+suma;
			suma +=2; 
		}while (contador<n); {				
			}
		System.out.println(total);
	}
}
