import java.util.*;
class Primenum
  {
   public static void main(String agrs[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++)
        {
        if(n%i==0)
          {
          count++;
          }
          } 
      if(count==2)
      {
     System.out.println("prime number");
      }
      else{
        System.out.println("not prime number");
      }
      }
   } 