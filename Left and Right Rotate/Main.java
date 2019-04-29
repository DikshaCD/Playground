import java.util.Scanner;
class Main 
{
  public static void l_r_even_ele(int size, int arr[], int no_of_rotation)
    {
    	int first_even_ele_index = 1;
    int last_even_ele_index;
    if(size % 2 == 0)
    {
      last_even_ele_index = size - 1;
    }
    else
    {
      last_even_ele_index = size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotation; rotation++)
    {
      int temp = arr[first_even_ele_index];
      for(int index = 3; index <size; index= index + 2)
      {
        arr[index - 2] = arr[index];
      }
      arr[last_even_ele_index] = temp;
    }
  	}
  public static void r_r_odd_ele(int size, int arr[], int no_of_rotation)
  {
   int first_odd_ele_index = 0;
    int last_odd_ele_index;
    if(size % 2 == 1)
    {
      last_odd_ele_index = size - 1;
    }
    else
    {
      last_odd_ele_index = size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotation; rotation++)
    {
      int temp = arr[last_odd_ele_index];
      for(int index = (last_odd_ele_index - 2); index >= 0; index= index - 2)
      {
        arr[index + 2] = arr[index];
      }
      arr[first_odd_ele_index] = temp;
    } 
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int index = 0; index <= (size - 1); index++)
    {
      arr[index] = in.nextInt();
    }
    int no_of_rotation = in.nextInt();
    l_r_even_ele(size, arr, no_of_rotation);
    r_r_odd_ele(size, arr, no_of_rotation);
    
     for(int index = 0; index <= (size - 1); index++)
     {
       System.out.print(arr[index]+" ");
     }
  }
}