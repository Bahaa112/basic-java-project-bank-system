package project1;
import java.util.Scanner;
public class Bank {
	Account [] accounts;
	Scanner input=new Scanner(System.in);
	Account a1=new Account();
	double add; //the number of money user want to add
	double withDraw;//the number of money user want to withdraw
	void addAmount()
	{
		System.out.print("how much money you want to add:");
		add=input.nextInt();
		//let the user to enter the number he want to add
		a1.balance+=add;
		// we put add to balance so we can calculate the account balance
		System.out.println("Balance became"+a1.balance);
		//a1 is object from class Account 
	}
	void withdrawAmount() 
	{
		System.out.print("how much money you want to withDraw:");
		withDraw=input.nextInt(); 
		//let the user to enter the number he want to withDraw
		a1.balance-=withDraw;
		// we minus withDraw from balance
		System.out.println("Balamce became:"+a1.balance);
	}
	void displayAccounts() 	

	{
		System.out.println("Displays all the Accounts details");
		//method with just print as you want for phase1
	}
	void addAccount() 
	{
		System.out.println("Adds information for a new account");
		//method with just print as you want for phase1

		
	}
	void uploadDataFile() {
		System.out.println("information uploaded");
		
	}
	void updateDataFile(){
		System.out.println("information updated");
		
	}
	
	

}

/*
 * Made By:
 * Bahaa Bani Shamsaa
 * 1220252
 * Abdallah hosam alqasarwi
 * 1221432
 */
