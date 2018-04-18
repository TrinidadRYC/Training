/*
        18/04/2018
        Algoritmo:
*/

import java.util.Scanner;

public class Triangular{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = 0;
    int sum = 0;
    int triangleCount = 0;

    while(input.hasNextLine()){
      n = input.nextInt();
      while(n != sum){
        sum = numTriang(n,sum);
        triangleCount++;
        //System.out.println("en while");
      }
      System.out.println(triangleCount);
      sum = 0;
      triangleCount = 0;
  }
  public static int numTriang(int n, int suma){
    boolean bandera = false;

    for (int i=1; i<=n && !bandera; i++) {
      suma+=i;
      if (suma==n) {
        bandera = true;
      }
      else if(suma > n){
        bandera = true;
        //System.out.println(suma);
        suma-= i;
      }
    }
    //System.out.println(suma +" lo que envia");
    return suma;
  }
}
