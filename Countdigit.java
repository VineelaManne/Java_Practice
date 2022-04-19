class Countdigit
  {
    public static void main(String[] args)
    {
    int count=0,num=0003452;
    while(num!=0)
      {
        num/=10;
        ++count;
      }
     System.out.println("Numeber of digits: " + count);
  
      }
  }