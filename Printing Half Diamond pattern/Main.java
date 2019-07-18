import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=0;
      for(int row=1;row<=n;++row,k=0){
        for(int space=1;space<=(n-row);++space){
          System.out.print(" ");
                                               }
        while(k!=2*row-1){
          System.out.print("*");
          ++k;
        }
        System.out.print("\n");
      }
	}
}