import java.util.*;
class Perfectnum
  {
   public static void main(String agrs[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<n;i++)
        {
        if(n%i==0)
          {
          sum=sum+i;
          }
          } 
      if(sum==n)
      {
     System.out.println("perfect number");
      }
      else{
        System.out.println("not perfect number");
      }
      }
   } 