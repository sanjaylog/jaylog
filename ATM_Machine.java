// THIS PROGRAM IS EXCECUTE TO DISPLAY THE ATM INTERFACE::)
package com.sanjay;

import java.util.Scanner;

	    public class ATM_Machine  
	    {   
	        public static void main(String args[] ) 
	        {
	        	int pin = 1234;
	  
	            int balance = 50000, withdraw, deposit; 
	            Scanner sc = new Scanner(System.in);
	            System.out.println("****WELCOME TO MY ATM*******");
	            System.out.println("Enter ATM Pin");
	            int apin = sc.nextInt();
	           if(pin==apin) {
	           
	           
	              while(true)  
	            {  
	                System.out.println("ATM Machine\n");  
	                System.out.println("Choose 1 for Withdraw");  
	                System.out.println("Choose 2 for Deposit");  
	                System.out.println("Choose 3 for Check Balance");  
	                System.out.println("Choose 4 for EXIT\n");  
	                System.out.print("Choose the operation:");  
	                  
	                //get choice from user 
	                Scanner sc1 = new Scanner(System.in);
	              
	                int choice = sc1.nextInt();  
	                switch(choice)  
	                {  
	                    case 1:  
	            System.out.print("Enter money to be withdrawn:");  
	                          
	            //get the withdraw money from user  
	            withdraw = sc1.nextInt();  
	                          
	            //check whether the balance is greater than or equal to the withdrawal amount  
	            if(balance >= withdraw)  
	            {  
	                //remove the withdraw amount from the total balance  
	                balance = balance - withdraw;  
	                System.out.println("Please collect your money");  
	            }  
	            else  
	            {  
	                //show custom error message   
	                System.out.println("Insufficient Balance");  
	            }  
	            System.out.println("");  
	            break;  
	       
	                    case 2:  
	                          
	            System.out.print("Enter money to be deposited:");  
	                          
	            //get deposit amount from to user  
	            deposit = sc1.nextInt();  
	                          
	            //add the deposit amount to the total balance  
	            balance = balance + deposit;  
	            System.out.println("Your Money has been successfully depsited");  
	            System.out.println("");  
	            break;  
	       
	                    case 3:  
	            //displaying the total balance of the user  
	            System.out.println("Balance : "+balance);  
	            System.out.println("");  
	            break;  
	       
	                    case 4:  
	            //exit from the menu 
	            System.out.println("Thank You For Using");
	            System.exit(0);
	            
	          default :
	        	  System.out.println("INVALID INPUT");
	            
	                }
	                
	                }  
	            
	        }  } }
	    
	      