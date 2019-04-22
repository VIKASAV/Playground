import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = n;
      int arm=0;
 /*while(x>0)
      {
      
   x=x/10;
   int count= count+1;
   
      }*/
      
      while(n>0)
      {
        int r=n%10;
         arm = arm + r*r*r;
        n=n/10;
      }
      if(arm==x)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
        
      
      
	}
}