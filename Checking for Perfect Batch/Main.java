import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++){
      list[i]=sc.nextInt();
    }
    perfect(list,n);
  }
  public static void perfect(int list[],int n){
    boolean isperfect=true;
    int batchsum=list[0]+list[1]+list[2];
    for(int i=3;i<=n-1;i=i+3){
      int cur=list[i]+list[i+1]+list[i+2];
      if(cur!=batchsum){
        isperfect=false;
      }
    }
    if(isperfect==true){
      System.out.println("Perfect Batch");
    }
    else
    {
        System.out.println("Not a Perfect Batch");
    }
  }
}