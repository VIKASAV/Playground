import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   
    int count=0;
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
       count=count+1;
       if(i%3==0 && i<n)
        System.out.print(",");
    }
  }
}