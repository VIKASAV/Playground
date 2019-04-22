import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact=1;
      int x=n;
      int sum=0;
      while(x>0)
      {
        int r=x%10;
        fact=1;
      for( int i=1; i<=r; i++)
      {
         fact = fact*i;
         
      }
        sum=sum+fact;
        x=x/10;
      }
      if(sum==n)
       System.out.println("Yes");
      else
        System.out.println("No");
        
	}
}