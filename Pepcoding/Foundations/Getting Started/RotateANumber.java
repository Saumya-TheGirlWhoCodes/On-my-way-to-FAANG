import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    // 1. number of digits
    int count = 0;
    int copy = n;
    while (copy != 0) {
      count++;
      copy = copy / 10;
    }

    // 2. number of rotations
    k = k % count;

    // 3. convert negative to positive rotation
    if (k < 0) {
      k = k + count;
    }

    // 4. preparing variable div and mult
    int div = 1, mult = 1;
    for (int i = 1; i <= count; i++) {
      if (i <= count - k) {
        mult = mult * 10;
      }
      else {
        div = div * 10;
      }
    }

    // 5. segregation
    int part1 = n / div;
    int part2 = n % div;

    // 6. re-joining
    int ans = (part2 * mult) + part1;

    System.out.println(ans);
  }
}
