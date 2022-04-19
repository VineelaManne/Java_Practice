import java.util.*;
class Productofnum
  {
    public static void main(String args[])
    {
      
      Scanner sc=new Scanner(System.in);
      int num,temp;
      int product=1;
      System.out.println("enter any number: ");
      num=sc.nextInt();
      temp=num;
      while(temp!=0)
        {
          product=product*(temp%10);
         temp=temp/10;
          }
        System.out.println("\n product of all digits"+ num +"  " + product);
        }
    }