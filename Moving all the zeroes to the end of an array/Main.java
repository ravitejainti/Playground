import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int arr_size= sc.nextInt();
      int arr[] = new int[arr_size];
      for(int idx= 0; idx<= arr_size - 1; idx++)
      {
        arr[idx]= sc.nextInt();
      }
      zero(arr_size, arr);
      for(int idx=0; idx<= arr_size-1; idx++)
      {
        System.out.print(arr[idx]+ " ");
      }
}
  public static void zero(int arr_size, int arr[])
  {
 int nonzerocount=0;
    for( int idx=0; idx<= arr_size- 1;idx++)
    {
    if(arr[idx]!=0)
    {
      int temp= arr[idx];
      arr[idx]= arr[nonzerocount];
      arr[nonzerocount]= temp;
      nonzerocount++;
      }
  }
  }
}