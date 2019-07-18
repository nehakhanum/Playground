import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int num=0;
      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
          if(row>=3)
            num=row+col+1;
            else
              num=row+col;
          if(row==5){
            num=row+col;
          }
          if(row==6){
            num=row+col;
          }
          
          if(num%2==0)
            System.out.print("*");
            else
              System.out.print("#");
          
        }
        System.out.print("\n");
      }
    }
}