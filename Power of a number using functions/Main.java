import java.util.Scanner;
class Main
{
  public static int power(int b, int e)
  {
    int result = 1;
    while(e != 0)
    {
      result *= b;
      --e;
    }
    return result;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base= in.nextInt();
     int exp= in.nextInt();
    int pow = power(base, exp);
    System.out.println(pow);
  }
}