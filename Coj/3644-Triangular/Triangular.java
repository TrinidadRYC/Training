/*
	18/04/2018
	Algoritmo: --
*/

import java.util.Scanner;

public class Triangular{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		int triangleCount = 0;
		boolean bandera = false;

		while(input.hasNextLine()){
			n = input.nextInt();
			while(n != sum){
				bandera = false;
				for (int i=1; i<=n && !bandera; i++)
				{
					sum+=i;
					if (sum==n) {
						bandera = true;
					}
					else if(sum > n){
						bandera = true;
						//System.out.println(suma);
						sum-= i;
					}
				}

				triangleCount++;
				//System.out.println("en while");
			}
			System.out.println(triangleCount);
			sum = 0;
			triangleCount = 0;
		}
	}
}
