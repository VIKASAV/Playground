import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
         Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      int i;
      int s;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
     }
       s=a[0];
      for(i=1;i<n;i++)
      {
       if(a[i]>s)
         s=a[i];
      }
      System.out.println(s);
    }
}