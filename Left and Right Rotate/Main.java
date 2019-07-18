import java.util.Scanner;
class Main 
{
  public static void left(int arr_size,int arr[],int rotations){
    int first=1;
    int last;
    if(arr_size%2==0){
      last=arr_size-1;
    }
    else
    {
      last=arr_size-2;
    }
    for(int rot=1;rot<=rotations;rot++){
      int temp=arr[first];
      for(int i=3;i<arr_size;i=i+2){
        arr[i-2]=arr[i];
      }
      arr[last]=temp;
    }
  }
  public static void right(int arr_size,int arr[],int rotations){
    int first=0;
    int last;
    if(arr_size%2==1){
      last=arr_size-1;
    }
    else
    {
      last=arr_size-2;
    }
    for(int rot=1;rot<=rotations;rot++){
      int temp=arr[last];
      for(int i=(last-2);i>=0;i=i-2){
        arr[i+2]=arr[i];
      }
      arr[first]=temp;
    }
  }
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<=(arr_size-1);i++){
      arr[i]=in.nextInt();
    }
    int rotations=in.nextInt();
    left(arr_size,arr,rotations);
    right(arr_size,arr,rotations);
    for(int i=0;i<=(arr_size-1);i++){
      System.out.print(arr[i]+" ");
    }
  	}
}