import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sq = n * n;
    return sq;
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int m = in.nextInt();
      int square1 = square(m);
      System.out.println(square1);
      
	} 
}