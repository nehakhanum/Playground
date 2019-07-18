import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=0;
      int second=0;
        while(n>=1)
        {
          first=n%10;
          n=n/1000;
        }
      System.out.println(first);
    }
}
        