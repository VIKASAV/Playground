import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int a[]=new int[n];
      int i,j;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      int val=in.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          int s=a[i]+a[j];
          if(s==val)
          {
            System.out.println(a[i]+", "+a[j]);
          }
        }
      }
    }
}