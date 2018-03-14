import java.util.Scanner;
public class aSimpleTask {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      long x = scan.nextLong();
      while(x != 0) {
        System.out.println(t(x));
        x = scan.nextLong();
      }
  }
public static long t(long b){
    b++;
    long a = 2, mod = 1000000007;
    long res = 1;
    while(b>0){
        if((b&1)==1)
            res=(a*res)%mod;
    b>>=1;
    a=((a)*(a))%mod;
    }
return res-1;
}
}
