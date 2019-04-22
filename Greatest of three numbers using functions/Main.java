import java.util.Scanner;
class Main{
  public static int great (int a,int b,int c){
    int r,x=0;
    if(a>b)
      r=a;
    else
      r=b;
    if(r>c)
      x=r;
    else 
      x=c;
      return x;
	    // Type your code here
	}

	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int x=great(n1,n2,n3);
      System.out.println(x);
	}
}