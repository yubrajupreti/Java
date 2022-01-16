import java.util.Scanner;

public class Myclass
{
    int x;
    int y;
    Myclass(int a,int b)
    {
        
        this.x=a;
        this.y=b;
    }
    
    public static void main(String args[])
    {
        Myclass myobj =new Myclass(5,10);
        Myclass myobj2= new Myclass(15,20);
        System.out.println(myobj.x);
        System.out.println(myobj.y);
        System.out.println(myobj2.x);
        System.out.println(myobj2.y);
         
        
    }
}