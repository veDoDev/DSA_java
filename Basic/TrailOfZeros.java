import java.io.*;

class Basic
  {
    public static void main(String args[])
    {
      Console c = System.console();
      
      int num = Integer.parseInt(c.readLine("number: "));
      int zero = TrailOfZeros(num);

      System.out.println("no. of zeros in "+num+"! : "+zero);
    }

    public static int TrailOfZeros(int n)
    {
      int zeros = 0;
      for(int i = 5; i<=n; i = i*5)
      {
        zeros = zeros+(n/i);
      }
      return zeros;
    }
    
  }
