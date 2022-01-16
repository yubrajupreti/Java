import java .util.Scanner;


public class Transpose
{
    public static void main(String args[])
    {
            int i,j,k;
            int [][] a =new int [10][10];
            int [][] b =new int [10][10];
            int [][] c =new int [10][10];
            int [][] d =new int [10][10];
            int sum = 0;
           
            Scanner m = new Scanner(System.in);
            System.out.println("Enter the value of rows and column");
            int r=m.nextInt();
            int c0=m.nextInt();
            for(i=0;i<r;i++)
            {
                for(j=0;j<c0;j++)
                {
                    System.out.println("Enter the value of "+i + j);
                    a[i][j]=m.nextInt();
                    
                }
            }
            System.out.println("the first matrix is :"+"\n"+"[");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c0;j++)
                {
                    System.out.print( a[i][j]+"\t" );
                }
                System.out.print("\n");
            }
            System.out.print("]"+"\n");
            
            System.out.println("Enter the value of rows and column");
            int ro=m.nextInt();
            int cl=m.nextInt();
            if(c0==ro)
            {
                for(i=0;i<ro;i++)
                {
                    for(j=0;j<cl;j++)
                    {
                        System.out.println("Enter the value of "+i + j);
                        b[i][j]=m.nextInt();
                        
                    }
                }
                System.out.println("the second matrix is :"+"\n"+"[");
                for(i=0;i<ro;i++)
                {
                    for(j=0;j<cl;j++)
                    {
                        System.out.print( b[i][j]+"\t" );
                    }
                    System.out.print("\n");
                }
                System.out.print("]"+"\n ");
                
                
                for(i=0;i<r;i++)
                {
                    for(j=0;j< c0;j++)
                    {
                        for(k=0;k< c0;k++)
                        {
                            sum=sum+a[i][k]*b[k][j];
                        }
                        c[i][j]=sum;
                        sum=0;
                    }
                }
                System.out.println("The multiplication of matrix is :");
                for(i=0;i<r;i++)
                {
                    for(j=0;j< c0;j++)
                    {
                        System.out.print(c[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
            
                
            } 
            else
            {
                System.out.println("Sorry!! The matrix cannot be multiplied. ");
            }
            
            System.out.println("The transpose of matrix is:");
            
            for(i=0;i<r;i++)
            {
                for(j=0;j<c0;j++)
                {
                    
                    d[i][j]= c[j][i];
                    System.out.print (d[i][j]+"\t");
                    
                }
                System.out.println("");
            }
    
    }
}
                

