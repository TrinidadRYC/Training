/*
	25/04/2018
	Algoritmo: ---
*/
import java.util.Scanner;

public class Chocolate{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();
		int cont = 0;
		int w = 0, h = 0;
		String hw = "";
		input.nextLine();

		while (cont<casos){
			hw = input.nextLine();
			//input.nextLine();
			h = Integer.parseInt(hw.split(" ")[0]);
			w = Integer.parseInt(hw.split(" ")[1]);
			if(h == w)
				System.out.println("2");
			else
				System.out.println("1");
			cont++;
		}
	}
}