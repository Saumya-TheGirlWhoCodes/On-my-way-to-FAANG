import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
      
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
          boolean isPrime=true;
          for(int j=2;j*j<=i;j++){
              if(i%j==0){
                  isPrime=false;
                  break;
              }
          }
          if(isPrime==true){
              System.out.println(i);
          }
        }
    }
}
