  
/**
 * Write a description of class BankAccount here.
 *
 * @author (Yubraj Upreti)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class BankAccount
{
      //here we will have the data types
      static Scanner input= new Scanner(System.in);
      static String bank_name="om nama shivaya Bank";
      static String bank_address ="kailash dhada";
      static boolean flag=true;
      long ac_num;
      static int  balance;
      long cus_id;
      String cus_name;
      String cus_address;
      String cus_phone;
      boolean status;
      
      //constructor goes here
      BankAccount()
      {
          this.balance=0;
          this.ac_num=1;
          this.cus_name="";
          this.cus_address="";
          this.cus_phone="";
          this.status=true;
          
      }
      //here we will write the methods
      static void welcome()
      {
          System.out.println("welcome to "+ bank_name);
          System.out.println("ek sarko jiwan arko");
      }
      
      //opening account method 
      void openingAccount()
      {
          System.out.println("enter your name");
          this.cus_name = input.nextLine();
          System.out.println("enter your address ");
          this.cus_address=input.nextLine();
          System.out.println("enter your phone number ");
          this.cus_phone=input.nextLine();
          input.nextLine();
          
          
          
          
          
      }
      //depositing method
      void  deposite( )
      {
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the amount you want to deposite");
          int depo=input.nextInt();
          this.balance=this.balance+depo;
          
          System.out.println("the balance after depositing is: "+this.balance);
          
      }
      //check balance methods
      void checkBalance()
      {
          System.out.println("Your current balance is "+this.balance);
          
      }
      
      
      
      //here case is switch from one function to another.
      static void switchCase()
      {
          System.out.println("1.opening account\n 2.checking balance \n 3.deposit \n4.withdraw \n5.Apply for credit card \n6.POS"+
                             "\n7.Pay bills\n 8.Loan\n0.Exit");
          int switch_case=input.nextInt();
          switch(switch_case)
          {
              //opening account
              case 1:BankAccount opening=new BankAccount();
                    opening.openingAccount();
                    
                    
              
              break;
              //checking the balance
              case 2:BankAccount check= new BankAccount();
                    check.checkBalance();
              
              break;
              //depositing the aamount
              case 3:BankAccount add=new BankAccount();
                    add.deposite();
                    
              
              break;
              
              case 4://withdraw an amount
              
              break;
              
              case 5://apply for credit card
              break;
              
              case 6://POS
              
              break;
              
              case 7://pay bills
              
              break;
              
              case 8://loan
              
              break;
              case 0://flag
                    flag=false;
                    break;
              
              
              
              
             
          }
      }
      
      
      
      //this is main function
      public static void main(String [] args)
      {
          
          while(flag)
          {
              welcome();
              switchCase();
              
          }
                  
              
      }
          
          
      
  
}

