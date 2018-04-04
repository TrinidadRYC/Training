/*
	04/04/2018
	No hay algoritmo en especifico.
*/
import java.util.Scanner;
public class Room
{
	public static void main(String[] args)
	{
		Scanner l = new Scanner(System.in);
		String ng = "";
		int temp = 0, grupo;
		int[] rooms;
		boolean full = false;
		ng = l.nextLine();
		rooms = new int[Integer.parseInt(ng.split(" ")[0])]; // habitaciones disponibles
		grupo = Integer.parseInt(ng.split(" ")[1]); // grupos

		for(int i = 0; i < grupo; i++)
		{
			temp = Integer.parseInt(l.nextLine());

			byte j=0;
			while(temp != 0)
			{
				//System.out.println("temp: "+ temp);
				if(temp > 1 && rooms[j] == 0)
				{
					//esta vacio, podemos meter 2
					rooms[j] += 2;
					temp -= 2;
				}
				else if(temp == 1 && rooms[j] == 0)
				{
					//esta vacio, solo hay 1
					rooms[j] = 1;
					temp--;
				}
				else
				{
					//no esta vacio y hay almenos alguien
					full = true; // pensar que esta  lleno
					for(int k = 0; k < rooms.length && full; k++)
					{
						//System.out.println(rooms[k]);
						if(rooms[k] == 0)
							full = false;
					}

					//System.out.println(full);

					if(full && rooms[j] == 1)
					{
						//todos estan llenos, pero el actual solo hay 1
						rooms[j] += 1;
						temp--;
					}
				}

				j++;

				if(j == rooms.length)
					j=0;
			}
		}
		for (int i = 0; i < rooms.length; ++i) 
		{
			//System.out.println("");
			System.out.println(rooms[i]);
		}
	}
}