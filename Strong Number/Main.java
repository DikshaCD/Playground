import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      int temp = n;
      while( n != 0)
      {
        int i = 1;
        int p = 1;
        int r = n % 10;
        while(i <= r)
        {
           p = p * i;
          i++;
        }
        sum = sum + p;
        n = n / 10;
      }
        if(sum == temp)
        
          System.out.println("Yes");
        
        else
        
          System.out.println("No");
        
      
	}
}