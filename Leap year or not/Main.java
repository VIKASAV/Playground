import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year= in.nextInt();
      int flag=0;
           if(year % 400 == 0)
        {
            flag = 1;
        }
        else if (year % 100 == 0)
        {
            flag = 0;
        }
        else if(year % 4 == 0)
        {
            flag = 1;
        }
        else
        {
            flag = 0;
        }
        if(flag==1)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Non Leap year");
        }
   
}
    
}