import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos = 1;
    int ans = 0;

    while (n != 0) {
      int val = n % 10;
      ans +=(pos * (Math.pow(10, val-1)));
      pos++;
      n = n / 10;
    }
    System.out.println(ans);
  }
}
