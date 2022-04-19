class Oddeven
  {
    public static void main(String agrs[])
    {
      System.out.println("Odd numbers");
      for(int i=0;i<=10;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
        }
      }
       System.out.println("even numbers");
      for(int i=0;i<=10;i++)
      {
        if(i%2==0)
        {
          System.out.println(i);
       }
      }
    }
  }