import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int value = n;
      for(int row = 1; row <= n; row++)
      {
        for(int col = value; col >= 1; col--)
        {
          System.out.print(col);
        }
        value--;
        System.out.println();
      }
	}
}