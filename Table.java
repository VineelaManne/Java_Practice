import java.util.*;
public class Table
  {
    public static void main(String agrs[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number:");
      int num=sc.nextInt();
       System.out.println("enter range:");
      int range=sc.nextInt();
      int i=1;
      while(i<=range)
        {
         System.out.println(num+"*"+i+"="+num*i);
          i++;
        }
    }
  }