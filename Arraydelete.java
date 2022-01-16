import java.util.Scanner;
public class Arraydelete
{
    public static void main(String args[])
    {
        
        Scanner input =new Scanner(System.in);
        int i;
        System.out.println("enter the number of digit u want to add");
        int digit=input.nextInt();
        int [] add =new int [digit];
        System.out.println("enter the number to be added");
        for (i=0;i<digit;i++)
        {
            add[i]=input.nextInt();
            
        }
        System.out.println("enter the index of the number to be deleted");
        int index= input.nextInt();
        for(i=index; i<digit-1;i++)
        {
            add[i]=add[i+1];
            
        }
        
        
        
        
        digit=digit-1;
        for(i=0;i<digit;i++)
        {
            System.out.println(add[i]);
            
        }
        
        
        
        
        
        
        
        
    }
}
