import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      
      Scanner sc=new Scanner(System.in);
      
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      int divisor=num1;
      int divident=num2;
      
      while(divident%divisor!=0){
          int rem=divident%divisor;
          divident=divisor;
          divisor=rem;
      }
      
      int hcf=divisor;
      System.out.println(hcf);
      
      int lcm=(num1*num2)/hcf;
      System.out.println(lcm);
     }
    }
