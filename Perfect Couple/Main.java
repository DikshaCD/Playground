import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int index = 0; index <= size-1; index++)
      {
        arr[index] = in.nextInt();
      }
      int value = in.nextInt();
      perfect_couple(size, arr, value);
    }
  public static void perfect_couple(int size, int arr[], int value)
  {
    for(int i1 = 0; i1 <= size-1; i1++)
    {
      for(int i2 = i1+1; i2 <= size-1;i2++)
      {
        int sum = arr[i1]+arr[i2];
        if(sum == value)
        {
          System.out.println(arr[i1] + "," + " " + arr[i2]);
        }
      }
    }
  }
    
}