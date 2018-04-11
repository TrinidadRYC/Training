import java.util.Scanner;

public class Chocolate{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int casos = input.nextInt();
    int cont = 0;
    int turno = 0;
    int w = 0, h = 0;
    String hw = "";
    input.nextLine();

    while (cont<casos){
      hw = input.nextLine();
      h = Integer.parseInt(hw.split(" ")[0]);
      w = Integer.parseInt(hw.split(" ")[1]);
      while (h!=0){
        turno++;
        h--;
      }
      while (w!=0){
        turno++;
        w--;
      }
      if (turno%2==0) {
        System.out.println(2);
      }else{
        System.out.println(1);
      }
      turno = 0;
      cont++;
    }
  }
}
