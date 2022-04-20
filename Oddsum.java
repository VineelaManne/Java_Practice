class Oddsum
  {
    public static void main(String args[])
    {
      int sum=0;
      for(int i=1;i<=100;i++)
        {
          if(i%2!=0)
          {
            sum=sum+1;
          }
        }
      System.out.println("the sum of 100 odd numbers are:"+sum);                           
    }
  }