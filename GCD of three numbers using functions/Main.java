import java.util.Scanner;
public class Main{
public static int great (int a,int b,int c){
    int x=0,min,gcd=0,r;
    if(a>b)
      min=a;
    else
      min=b;
    int i=1;
    while(min>=1)
    {
      if(a%min==0 && b%min==0)
      {
        gcd=min;
        break;
      }
      min--;
      i++;
    }
  if(gcd>c)
    min=gcd;
  else
    min=c;
    i=1;
    while(min>=1)
    {
      if(gcd%min==0 && c%min==0)
      {
        x=min;
        break;
      }
      min--;
      i++;
    }

  return x;
  
	    // Type your code here
	}

	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int w=great(n1,n2,n3);
      System.out.println(w);
	}
}