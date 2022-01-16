import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        int i,low=0,flag=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string to check");
        String word= input.nextLine();
        int length = word.length()-1;
        int high = length;
        for (i=0;i<=length/2;i++)
        {
            if(word.charAt(low)==word.charAt(high))
            {
                low++;
                high--;
            }
            else
            {
                flag=1;
                break;
            }
            
        
        }
        if(flag==0)
        {
            System.out.println( word + " is a palindrome");
        }
        else
        {
            System.out.println(word + " is not a palindrome");
        }
        
    }
    
}
