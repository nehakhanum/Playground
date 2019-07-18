import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      //int option=in.nextInt();
      switch(n){
        case 1:
         // if(n==1)
            System.out.println("One");
          break;
           case 2:
          //if(n==2)
            System.out.println("Two");
          break;
           case 3:
          //if(n==3)
            System.out.println("Three");
          break;
           case 4:
          //if(n==4)
            System.out.println("Four");
          break;
           case 5:
          //if(n==5)
            System.out.println("Five");
          break;
        default:
          System.out.println("Invalid");
          break;
      }
	}
}