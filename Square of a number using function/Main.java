import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int r = n*n;
    return r;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = square(n);
      System.out.println(a);
	} 
}