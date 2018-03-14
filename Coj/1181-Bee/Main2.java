import java.util.Scanner;
public class Main2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = 0;

    n = scan.nextInt();
    while(n != -1) {
    int male = 0,
		prevMale = 0,
		female = 0;
		for (int i = 1; i <= n; ++i){
			prevMale = male;
			male = female + male + 1;
			female = prevMale;
		}
    System.out.printf("%d %d %n", male, female+male+1);
      n = scan.nextInt();

    }
  }
}
