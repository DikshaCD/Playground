import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = n - 1;
      for(int row = 1; row <= n; row++)
      {
        for(int sp = 1; sp <= count; sp++)
        {
          System.out.print(" ");
          
        }
        count--;
        for(int col = 1; col <= (2 * row)- 1; col++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}