import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int i,x=0,y=0;
          for(i=0;i<n;i++)
            a[i]=in.nextInt();
    if(n%2==0)
    {
      for(i=0;i<n/2;i++)
     x=x+a[i];
            for(i=n/2;i<n;i++)
              y=y+a[i];
      if(x==y)
        System.out.println("Perfect Batch");
      else
        System.out.println("Not a Perfect Batch");
    }
     else if(n%2==1)
    {
      for(i=0;i<n/2;i++)
     x=x+a[i];
            for(i=n/2;i<n;i++)
              y=y+a[i];
      if(x==y)
        System.out.println("Perfect Batch");
      else
        System.out.println("Perfect Batch");
    }
  }
}