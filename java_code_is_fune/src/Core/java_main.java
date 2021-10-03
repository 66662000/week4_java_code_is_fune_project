package Core;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;



public class java_main {


	public static void main(String args[]) {
		System.out.println("---------Welcome to our week3 java programm 'Code is fune'!-----------\n-----------------------------Your Menu------------------------------\nChoose and type your option number:\n1----Tester la primalité d’un nombre saisi par l’utilisateur\r\n"
				+ "2----Calculer le factoriel d’un nombre saisi par l’utilisateur\r\n"
				+ "3----Calculer le PGCD de n (n>=2) entiers saisis par l’utilisateur\r\n"
				+ "4----Calculer le PPMC de n (n>=2) entiers saisis par l’utilisateur\r\n"
				+ "5----Effectuer la recherche dichotomique d’un élément dans une liste d’éléments (Préférablement numériques)\r\n"
				+ "6----Empiler et dépiler une liste de nombres par la méthode LIFO (Stack en Java) \n-----------------------------------Choose your option------------------------------------");
		Scanner src=new Scanner(System.in);
		int nb=src.nextInt();
		
		//If the user chooses 1: Primality test of a number
		
		if (nb==1) {

			int rest;
			 boolean cond = true;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the number wich you want to test it's primality:");
			int nbr=in.nextInt();

			for(int i=2; i <= nbr/2; i++) {
				rest=nbr%i;
				
				if(rest == 0)
			     {
			        cond= false;
			        break;
			     }
			}
			
			 if(cond)
			     System.out.println(nbr + " is a prime number");
			  else
			     System.out.println(nbr + " is not a prime number");
			 
			  }
		
		//If the user chooses 2: Factorial of a number
		
		else if(nb==2) {
			System.out.println("Enter the number which you want to have it's factorial:");
			Scanner fac=new Scanner(System.in);
			int nbr=fac.nextInt();
		if(nbr>0)
		{
			int factoriel=1;
			for(int i=1; i<=nbr; i++)
			{
				factoriel=factoriel*i;
			}
			System.out.println("The factorial of "+nbr+" is "+factoriel);
		}
		else 
		{			
			System.out.println("Error! The number should be positive.");
		}
			
		}
		
		//If the user chooses 3: GCD algorithm

		else if(nb==3)
				{
					
					System.out.println("How many numbers do you want to enter?:");
					Scanner val=new Scanner(System.in);
					int size=val.nextInt();
					int array[]=new int[size];
					
					if(size>=2)
					{
						for (int i=0;i<array.length;i++)
						{
							
							
							
							if(i==0) {
								System.out.println("Enter your first number");
							}
							else if(i>0 && i<array.length-1) {
							System.out.println("Enter your next number");
							}
			 				else
							{
								System.out.println("Enter your last number");
							}
								Scanner inpNb=new Scanner(System.in);
							
								array[i]= inpNb.nextInt();
							
							
						}
						
						System.out.println("Your values are: "+Arrays.toString(array)+ " \nTheir GCD is:");
						
					    System.out.println(GCD.findGCD(array, array.length)); 
							
						}
					
					else if(size<2)
					{
						System.out.println("Error! Enter at least 2 numbers please! Retry!!!");
						
					}

				}
		
	
		//If the user chooses the 4th option: LCD algorithm
		
		else if(nb==4)
		{
			
			System.out.println("How many numbers do you want to enter?:");
			Scanner val=new Scanner(System.in);
			int size=val.nextInt();
			int array[]=new int[size];
			
			if(size>=2)
			{
				for (int i=0;i<array.length;i++)
				{				
					
					if(i==0) {
						System.out.println("Enter your first number");
					}
					else if(i>0 && i<array.length-1) {
					System.out.println("Enter your next number");
					}
	 				else
					{
						System.out.println("Enter your last number");
					}
						Scanner inpNb=new Scanner(System.in);
					
						array[i]= inpNb.nextInt();
					
					
				}
				
				System.out.println("Your values are: "+Arrays.toString(array)+ " \nTheir LCM is:\n");
				
			   
			    System.out.println(lcm_array.lcm(array));
					
				}
			
			else if(size < 2)
			{
				System.out.println("Error! Enter at least 2 numbers please");
				
			}

		}
		
		
		//If the user chooses 5: Binary search
		
		
		else if(nb==5)
			
			{
			System.out.println("How many numbers do you want to enter?:");
			Scanner val=new Scanner(System.in);
			int size=val.nextInt();
			int array[]=new int[size];
			
			if(size>=2)
			{
				for (int i=0;i<array.length;i++)
				{					
					if(i==0) {
						System.out.println("Enter your first number");
					}
					else if(i>0 && i<array.length-1) {
					System.out.println("Enter your next number");
					}
	 				else
					{
						System.out.println("Enter your last number");
					}
					
						Scanner inpNb=new Scanner(System.in);
					
						array[i]= inpNb.nextInt();
					
				}
				System.out.println("Your values are: "+Arrays.toString(array)+ " \nType a number to search:\n");
				if(bin_Search.dichresearch(array, src.nextInt()))
				{
					System.out.println(true);
					System.out.println("\nThe number exists in your array.");
				}
				else
				{
					System.out.println(false);
					System.out.println("\nThe number does not exist in your array.");
				}

				}
			
			else if(size < 2)
			{
				System.out.println("Error! Enter at least 2 numbers please.");
				
			}
				
		}
		
		
		//If the user chooses 6: LIFO
		
		
		if(nb==6)
		{
			System.out.print("Welcome to LIFO:\n");
			
			// Let's create the Stack
	        Stack<Integer> stacknumber = new Stack<>();

	        // Let's Push new items to the Stack
	        stacknumber.push(91);
	        stacknumber.push(22);
	        stacknumber.push(73);
	        stacknumber.push(45);

	        System.out.println("The Stack is" + stacknumber);
	        System.out.println();

	        // Let's Pop items from the Stack
	        Integer cardAtTop = stacknumber.pop();  // To throw EmptyStackException if the stack is empty
	        System.out.println("The Stack pop is " + cardAtTop);
	        System.out.println("The Current Stack is " + stacknumber);
	        System.out.println();

	        // Get the item at the top of the stack without removing it
	        cardAtTop = stacknumber.peek();
	        System.out.println("The Stack peek is " + cardAtTop);
		}
		
			
		 
		else if(nb>6 || nb<1)
		{
			System.out.println("Error!  Please enter a valid number and than retry... ");
		}
		
		
					
	}

	
		
		
}
