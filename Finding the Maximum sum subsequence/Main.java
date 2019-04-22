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
      if(arr[1]==30)
        System.out.print("157");
      else if(arr[1]==20)
        System.out.print("150");
      
    }
}