import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
     int matrix2[][] = new int[r][c];
    int sub[][] = new int[r][c];
    for(int i=0;i<=r-1;i++)    {
      for(int j =0;j<=c-1;j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
     for(int i=0;i<=r-1;i++)
    {
      for(int j =0;j<=c-1;j++)
      {
        matrix2[i][j] = in.nextInt();
      }
     }
       sub_of_2_matrices(matrix1,matrix2,sub,r,c);
       display(sub,r,c);
     }
    public static void sub_of_2_matrices(int matrix1[][],int matrix2[][], int sub[][],int r,int c)
    {
       for(int i=0;i<=r-1;i++)
    {
      for(int j =0;j<=c-1;j++)
      {
        sub[i][j] = matrix1[i][j]-matrix2[i][j];
      }
           }
     }
      public static void display(int matrix[][],int r,int c)
      {
          for(int i=0;i<=r-1;i++)
    {
      for(int j =0;j<=c-1;j++)
      {
        System.out.print(matrix[i][j]+" ");
      }
            System.out.println();
           }
      }
  
    }

