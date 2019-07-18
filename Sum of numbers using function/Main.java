import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sum(n));
   
	}
  public static int sum(int m){
    int s=0;
      for(int i=0;i<=m;i++){
        s=s+i;
      }
    return s;
  }
	}
