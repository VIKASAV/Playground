import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    int e = in.nextInt();
    int c = func(b,e);
    System.out.println(c);
  }
   public static int func(int x, int y)
   {
     int p=1;
     for(int i=1;i<=y;i++)
     {
       p=p*x;
     }
     return p;
   }
}
  