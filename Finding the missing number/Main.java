import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here

        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int temp[] = new int[n];
      int count=0,s=0;
      int i;
      for(i=0;i<=n-1;i++)
      {
        arr[i] = in.nextInt();
      }
      s=((n+2)*(n+1))/2;
      for(i=0;i<n;i++)
        s=s-arr[i];
      System.out.print(s-3);
      
    }
}