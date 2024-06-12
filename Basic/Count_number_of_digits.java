import java.io.*;

class Basic
  {
    public static void main(String args[])
    {
      Console c = System.console();
      
      int num = Integer.parseInt(c.readLine("number: "));
      int digits = CountDigits(num);

      System.out.println("Count of digits: "+digits);
    }

    public static int CountDigits(int x)
    {
      int count = 0;

      while(x>0)
        {
          x = x/10;
          count++;
        }
      return count;
    }
    
  }
