package project1;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Account a=new Account();
		Bank b =new Bank();
		//b is the object from class Bank
		Scanner input=new Scanner(System.in);
		int number ;
		
		do
		{
			displayMainMenu();	
			number=input.nextInt();
			// number is the number of the operation
			switch(number)
			{
			case 1:
			System.out.print("id:");
			a.setId(input.nextInt());
			System.out.print("name:");
			a.setholderName(input.next());
			System.out.print("phone number:");
			a.setphoneNumber(input.nextInt());
			System.out.print("account type:");
			a.setaccountType(input.next().charAt(0));
			// the account information
			break;
			case 2:
				b.displayAccounts();
				break;
			case 3:
				b.addAmount();
				//addAmount from class Bank
				break;
			case 4:
				b.withdrawAmount();
				//withdrawAmount from class Bank

				break;
			case 5:
				viewAccountDetails();
				
				break;
			case 6:
				modifyAccountDetails();
				break;
			case 7:
				closeAccount();
				break;
			case 8:
				System.out.println("thank you for your time");
				break;
				default:System.out.println("wrong input, please enter another number");
				
			}
			//if number=8 the code print thank you for your time and finish the run
			//if user input number not between 1-8 the code print wrong input please enter another number
			
			
				
			

		}
		while(number!=8);
		
		
	}
	
	
	public static void displayMainMenu() {
		
		
		System.out.println("Please select an operation");
		System.out.println("1- Add Account");
		System.out.println("2- View All Accounts");
		System.out.println("3- Add Amount");
		System.out.println("4- Withdraw Amount");
		System.out.println("5- View Account Details");
		System.out.println("6- Modify Account");
		System.out.println("7- Close an Account");
		System.out.println("8- Exit");
		System.out.print("enter choice:");
		//operations
		
		
		

			
		
		
		
	}
	
private static void closeAccount() 
	
	{
	System.out.println("Removes information of old account ");
	//method with just print as you want for phase1

		
	}
	private static void viewAccountDetails() 
	{
		System.out.println("Searches for a certain account details");
		//method with just print as you want for phase1

		
	}
	private static void modifyAccountDetails()
	{
		System.out.println("Modifies a certain account details");
		//method with just print as you want for phase1

		
		
	}

	
		
		

	

}
/*
 * Made By:
 * Bahaa Bani Shamsaa
 * 1220252
 * Abdallah hosam alqasarwi
 * 1221432
 */

