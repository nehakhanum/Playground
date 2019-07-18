import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int last=n%10;
      int first=0;
        while(n>=1)
        {
          first=n;
          n=n/10;
        }
      System.out.println(first+last);
	}
}