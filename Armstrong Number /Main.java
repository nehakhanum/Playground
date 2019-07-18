import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n = in.nextInt();
      int temp=n;
      int res=0;
      while(temp!=0)
      {
        int rem=temp%10;
        res+=Math.pow(rem,3);
        temp=temp/10;
      }
      if(res==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
        
      
	}
}