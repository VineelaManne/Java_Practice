import java.util.*;

class Pallindrome
  {
   public static void main(String agrs[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int rev=0;
      int temp=n;
      
      while(n!=0)
        {
          int rem=n%10;
          rev=rev*10+rem;
          n=n/10;
        }
      if(rev==temp){
        System.out.println("pallindrom");
      }
      else{
        System.out.println("not pallindrom");
      }
      }
  }