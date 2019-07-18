import java.util.*;
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=n/10;
      int second=n%10;
      int sum=first+second;
      System.out.println(sum);
	}
}