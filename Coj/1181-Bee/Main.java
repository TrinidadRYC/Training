/*
	21/03/2018
	Algoritmo: suma de Fibonacci
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;

		n = scan.nextInt();
		while(n != -1) {
			System.out.printf("%d %d %n", beeTotal(n - 1), beeTotal(n));
			n = scan.nextInt();

		}
	}
	public static int beeTotal(int n) {
		int a = 0, b = 1, c = 0, suma = 1;
		for(int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			suma += b;
		}
		if(n < 0)
			return 0;
		else if ( n == 0)
			return 1;
		else
			return suma;
		}
	}
