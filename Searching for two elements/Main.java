import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      
    }
      int s1=in.nextInt();
      int s2=in.nextInt();
        int count=0;
      for(i=0;i<=n;i++)
      {
        if(a[i]==s1)
        {
          count++;
          break;
        }
      }
        if(count==1)
          System.out.println(i);
        else
          System.out.println("-1");
      count=0;
      for(i=0;i<n;i++)
      {
        if(a[i]==s2)
        {
          count++;
          break;
        }
      }
        if(count==1)
          System.out.println(i);
        else
          System.out.println("-1");
      
}
}