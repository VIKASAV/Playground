import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int sum=0;
      int newn=n;
      //int newn=n;
      //int digit_count=0;
      while(newn>0)
      {
       n=newn;
        n=n%10;
        sum=sum+n;
        newn=newn/10;
	}
      System.out.println(sum);
	}
}
