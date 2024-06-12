import java.io.*;

class Basic
  {
    public static void main(String args[])
    {
      Console c = System.console();
      
      int num = Integer.parseInt(c.readLine("number: "));
      int factorial = Factorial(num);

      System.out.println("Factorial: "+factorial);
    }

    public static int Factorial(int n)
    {
      int fact = 1;
      while(n>0)
        {
          fact = fact*n;
          n--;
        }
      return fact;
    }
    
  }
