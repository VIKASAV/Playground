import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
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
      for(i=n-1;i>=0;i--)
      {
        temp[s]=arr[i];
        s++;
      }
  
    /*   if(Arrays.equal(arr[],temp[]))
          System.out.print("Yes");
      else
         System.out.print("No");*/
      for(i=0;i<=n-1;i++)
      {
        if(temp[i]==arr[i])
          count++;
    
    }
      if(count==n)
      System.out.print("Yes");
      else
         System.out.print("No");
      
      
    }
}