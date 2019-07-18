import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n_first=n/100;
      int n_third=n%10;
      int add=n_first+n_third;
      System.out.println(add);
      
	}
}