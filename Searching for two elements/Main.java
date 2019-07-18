import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<=arr_size-1;i++){
        arr[i] = in.nextInt();
      }
      int search1=in.nextInt();
      int search2=in.nextInt();
      int ele1=-1;
      int ele2=-1;
      for(int i=0;i<=arr_size-1;i++){
        if(search1==arr[i]){
          ele1=i;
        }
        if(search2==arr[i]){
          ele2=i;
        }
      }
      System.out.println(ele1);
      System.out.println(ele2);
    }
}