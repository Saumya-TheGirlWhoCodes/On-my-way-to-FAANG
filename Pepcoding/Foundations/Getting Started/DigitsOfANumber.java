import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int pow=1;
      int copy=n;
      while(n>9){
          n=n/10;
          pow=pow*10;
      }
      while(pow!=0){
          int digit=copy/pow;
          System.out.println(digit);
          copy=copy%pow;
          pow=pow/10;
      }
     }
    }
