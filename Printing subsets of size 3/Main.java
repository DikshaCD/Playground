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
      subsets_of_size_3(size, arr);
    }
  public static void subsets_of_size_3(int size, int arr[])
  {
    for(int index1 = 0; index1 <= size-2; index1++)
    {
      for(int index2 = index1 + 1; index2 <= size-1;index2++)
      {
        for(int index3= index2 + 1; index3 <= size -1; index3++)
        {
          System.out.print("(" + arr[index1] + "," + " " + arr[index2]+ "," + " " + arr[index3] + ")" + " " );
        }
      }
      System.out.println();
    }
  }
}