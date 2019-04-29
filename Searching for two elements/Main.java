import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        arr[idx] = in.nextInt();
      }
      int search_ele_1 = in.nextInt();
      int search_ele_2 = in.nextInt();
      int ele_1_idx = -1;
      int ele_2_idx = -1;
      for(int idx = 0; idx <= arr_size-1; idx++)
      {
        if(search_ele_1 == arr[idx])
        {
          ele_1_idx = idx;
        }
        if(search_ele_2 == arr[idx])
        {
          ele_2_idx = idx;
        }
      }
      System.out.println(ele_1_idx);
      System.out.println(ele_2_idx);
    }
}