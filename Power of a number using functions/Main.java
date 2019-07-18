import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int expo=in.nextInt();
      System.out.print(power(base,expo));
    }
  public static int power(int base,int expo){
    int p=1;
    while(expo>=1){
      p=p*base;
      expo--;
    }
    return p;
  }
}