import java.util.Scanner;
public class Rectangle
{
    int l,w;
    Rectangle(int a)
    {
        this.l=a;
        this.w=a;
    }
    Rectangle(int a,int b)
    {
        this.l=a;
        this.w=b;
    }
    public static void main(String args[])
    {
       Scanner in =new Scanner(System.in);
       System.out.println("press 1. to calculate area of square"+"\n"+"press 2. to calculate area of rectangle");
       int input=in.nextInt();
       
       if(input==1)
       {
           System.out.println("enter the value of length of square");
           int len=in.nextInt();
           Rectangle square= new Rectangle(len);
           int area =len*len;
           System.out.println("the area of square is "+ area);
       }
       else if(input==2)
       {
           System.out.println("enter the value of length and breadth of rectangle");
           int len=in.nextInt();
           int bre=in.nextInt();
           Rectangle rec= new Rectangle(len,bre);
           int area =len*bre;
           System.out.println("the area of rectangle is "+ area);
           
       }
       else
       {
           System.out.println("Invalid input");
       }
    }
}