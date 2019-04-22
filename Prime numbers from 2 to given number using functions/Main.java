import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      func(n);
      
	}
  public static void func (int x){
  
    for(int i=1;i<=x;i++)
    {
        int count=0;
      for(int j=1; j<=x ; j++)
      {
      if(i%j==0)
        count++;
      }
      if(count==2)
        System.out.println(i);
    }
    
  }
      
  
}