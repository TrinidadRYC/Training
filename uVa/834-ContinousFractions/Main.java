/*
07/03/2018
Algoritmo: Euclid (checar fracciones continuas)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String completa = "";
    int p = 0, q = 0, mod = 0;
    while((completa = bf.readLine()) != null) {
      p = Integer.parseInt(completa.split(" ")[0]);
      q = Integer.parseInt(completa.split(" ")[1]);
      System.out.printf("[%d;",p/q);
      while(p%q > 0) {
        mod = p%q;
        p = q;
        q = mod;
        if(p%q == 0) System.out.printf("%d]%n",p/q);
        else System.out.printf("%d,",p/q);
      }
    }
  }
}
