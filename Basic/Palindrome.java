import java.io.*;

class Basic
  {
    public static void main(String args[])
    {
      Console c = System.console();
      
      int num = Integer.parseInt(c.readLine("number: "));
      boolean IsPalindrome = CheckPalindrome(num);

      System.out.println(IsPalindrome);
    }

    public static boolean CheckPalindrome(int x)
    {
      int rev = 0, digit, temp = x;
      while(x>0)
        {
          digit = x%10;
          rev = (rev*10)+digit;
          x = x/10;
        }
      return (rev == temp);
    }
    
  }
