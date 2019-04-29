import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum = 0;
      while(n > 0)
      {
        int digit = n % 10;
        int a = digit * digit * digit;
        sum = sum + a;
        n = n / 10;
      }
      if(temp == sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
       System.out.println("Not a Armstrong Number"); 
      }
      
	}
}