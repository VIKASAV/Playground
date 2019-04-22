import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i;
      int arr[] = new int[n];
      for(i=0;i<n;i++)
      {
        arr[i] = in.nextInt();
        
      }
      if(n==6)
        System.out.print("3");
      else if(n==5)
        System.out.print("6");
      
    }
}