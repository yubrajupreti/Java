import java.util.Scanner;
public class Arrayinsert
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        int i;
        System.out.println("enter the number of digit u want to add");
        int digit=input.nextInt();
        int [] add =new int [digit+1];
        System.out.println("enter the number to be added");
        for (i=0;i<digit;i++)
        {
            add[i]=input.nextInt();
            
        }
        System.out.println("enter the index where element should be added");
        int index= input.nextInt();
        System.out.println("enter the  element should be added");
        int element =input.nextInt();
        for(i=digit-1;i>index;i--)
        {
            add[i+1]=add[i];
            
        }
        add[index]=element;
        digit=digit+1;
        for(i=0;i<digit;i++)
        {
            System.out.println("The element after insertion are \n"+add[i]);
        }
    }
    
}    
        
        
   
   