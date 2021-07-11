package atmMachine;
   
import java.util.Scanner;
public class ATM {
     
	
	 static String name="Beneficiary Name  -  ROHIT KUMAR";
	 
	 static int pin=1046;
	 static  String accountno="378443285";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		
		System.out.println("*********************    ATM  MACHINE   **************************");
		System.out.println();
		
		System.out.println(" Insert your ATM card ");
		
		
		
		String n=sc.nextLine();
		 System.out.println();
		
		
		System.out.println("1.Cash Deposit                                     2.withdrawal");
		System.out.println();
		System.out.println("3.Pin Generation                                   4.Check Balance");
		System.out.println();
		System.out.println("5.Mini Statement                                    6.Exit");
		
		System.out.println();
		System.out.println("Enter your choice ");
		
		int ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1: 
			//System.out.println("Enter Amount ");
			
		//	int a=sc.nextInt();
			
			ATM t=new ATM();
			t.cashDeposit();
			break;
			
		case 2:
			
			ATM t2=new ATM();
			
			
			
			t2.withdrawal();
			break;
			
		case 3:
			
			ATM t3= new ATM();
			t3.pinGenration();
			break;
			
		case 4:
			ATM t4=new ATM();
			t4.checkBalance();
			break;
		case 5:
			ATM t5=new ATM(); 
			t5.miniStatement();
			break;
		case 6: 
			 System.out.println();
			 System.out.println("Thanks for Using ATM MACHINE");
			System.exit(1);
			
			default :
			       System.out.println("Invalid choice");
			
		
		
		}
		
		
	}
		
	

	
	 public static void cashDeposit()
	 {
		   System.out.println("Enter your Registered 10 Digit mobile number");
		   Scanner sc2=new Scanner(System.in);
		   
		   String mob=sc2.nextLine();
		 //  mob=sc2.next();
		   
		   String mobi="9608693830";
		   
		   
		   if(mob.equals(mobi))
		   {
			   System.out.println("Enter Account Number");
			   String acc=sc2.nextLine();
			   
			   
			   String accountno="378443285";
			   
			   if(accountno.equals(acc))
			   {
				   System.out.println(name);
				   
				   System.out.println();
				   
				   System.out.println("Enter Amount");
				   
				   float amount=sc2.nextFloat();
				   float balance=0;
				   balance=amount;
				   System.out.println();
				   System.out.println("You have Successfully Deposit Rs. "+amount+"");
				   System.out.println();
				   System.out.println("Thanks for Using ATM MACHINE  ");
				   
			   }
			   else
			   {
				   System.out.println(" Wrong Account Number ");
				   System.out.println();
				   System.out.println("Thanks for Using ATM MACHINE ");
			   }
		   }
		   else
		   {
			   System.out.println();
			   System.out.println("Wrong Mobile Number ");
			   
			   System.out.println();
			   
			   System.out.println("Thanks for Using ATM MACHINE");
			   


			   
		   }
		   
		   
		   
	 }
	 
	 public static void withdrawal()
	 {
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter your PIN");
			
			int pin=sc1.nextInt();
			
			int pim=1046;
			
         if(pin!=pim)
		   {
				System.out.println(" WRONG  PIN NUMBER  ");
				
				System.out.println();
			   
				System.out.println(" Thanks for using ATM ");
				
			 }
	   else
	    {
				  
				System.out.println(name);
			  
		 
		 
		 System.out.println();
		 System.out.println("Enter two  number");
		 Scanner sc3=new Scanner(System.in);
		 
		 int n2=sc3.nextInt();
		 int n3=sc3.nextInt();
		 
		 
		 System.out.println("current ");
		 System.out.println();
		 System.out.println("Saving");
		 
		 String s=sc3.nextLine();
		 sc3.next();
		 
		 System.out.println("Enter Amount  ");
		 float am=sc3.nextFloat();
		 
		 float tamount=50000;
		 if(am<=tamount)
		 {
			 System.out.println("your withdrawal is successfull  ");
			 System.out.println();
			 System.out.println("Do you want to know balance  Y/N");
			 
			 char c =sc3.next().charAt(0);
			 
			 if(c=='y' || c=='Y' || c=='n' || c=='N')
			 {
			 if(c=='y' || c=='Y')
				 
				 
			 {
				 System.out.println();
				 System.out.printf("Your Account Balance is Rs %f ",tamount-am);
				 System.out.println();
			 }
			 else
			 {   
				
				 
				 System.out.println("Thanks for Using ATM MACHINE");
				 
			 }
			 }
			 else
			 {  System.out.println();
				 System.out.println("Invalid Input");
				 System.out.println();
				 System.out.println("Thanks for Using ATM");
			 }
		 }
		 else {
			 
			 System.out.println();
			 System.out.println("Over Limit ");
			 System.out.println();
			 System.out.println("Thanks for Using ATM MACHINE");
		  }
	 }
		 	
		 
	 }
	
public static void pinGenration()
{ 
	Scanner sc4=new Scanner(System.in);
	
	 System.out.println();
	 System.out.println("Enter your old pin ");
	 int p1=sc4.nextInt();
	 
	 if(p1!=pin)
	 { 
		 System.out.println();
		 System.out.println("WRONG PIN number");
		 System.out.println();
		 System.out.println("Thanks for Using ATM MACHINE");
	 }
	 else
	 {
		 System.out.println();
		 System.out.println("Enter New PIN number");
		 int e=sc4.nextInt();
		 System.out.println();
		 System.out.println("Rewrite PIN number");
		 int r=sc4.nextInt();
		 
		 if(r==e)
		 {
			 System.out.println();
			 System.out.println(" PIN Changed Successfully ");
			 System.out.println();
			 System.out.println();
			 System.out.println("Thanks to Using ATM Machine");
		 }
		 else
		 {
			 System.out.println();
			 System.out.println("PIN number does not Match");
			 System.out.println();
			 System.out.println("Thanks to Using ATM Machine");
		 }
	 }
	 
}

public static void checkBalance()
{
	Scanner sc5=new Scanner(System.in);
	 System.out.println();
	 System.out.println("ENter your PIN number ");
	 int pi=sc5.nextInt();
	 
	 if(pi!=pin)
	 {
		 System.out.println();
		 System.out.println("Wrong PIN number");
		 System.out.println();
		 System.out.println("Thanks for Using ATM MACHINE");
	 }
	 else
	 {
	 System.out.println();
	 System.out.println("Your Total Account Balance is Rs- 100000");
	 
	 }
	
}

public static void miniStatement()
{
	System.out.println();
	System.out.println("Enter your PIN number");
	Scanner sc6=new Scanner(System.in);
	int ui=sc6.nextInt();
	if(pin==ui)
	{
	 System.out.println();
	 System.out.println(name);
	 System.out.println();
	 
	 System.out.println("Account Number :      "+accountno);
	 System.out.println();
	 System.out.println("Account Type :          Current");
	 System.out.println();
	 System.out.println("joining date :          01/01/2021 ");
	 System.out.println();
	 System.out.println("Last Transaction :      11/07/2021");
	 System.out.println();
	 System.out.println("Balance :               Rs.100000");
	 System.out.println();
	}
	else
	{
		System.out.println();
		System.out.println("Wrong PIN Number");
		System.out.println();
		System.out.println("Thanks to Using ATM MACHINE");
	}
	
	 
	 




	 
}
	 
	 
	 
	 
	 
}
