package com.exercises;

import java.lang.ref.SoftReference;
import java.util.Scanner;


public class Main {

	static Scanner intReader = new Scanner(System.in);
	static Scanner strReader = new Scanner(System.in);
	static Scanner doubleReader = new Scanner(System.in);
	static Double[] prices; 
	static String[] items;
	static int ammount = 0;
	
	public static void main(String[] args) {

		recieptInOut();
		
		
// Menu
/*		String title = " ";

		
		System.out.println("Please pick from the following list one option: "
				+ "\n1.Female"
				+ "\n2.Male"
				+ "\n3.Other");
		Integer answer = intReader.nextInt();

		
		System.out.println("Enter your last name: ");
		String name = strReader.nextLine();
		
		
		switch (answer) {
		case 1:
			title = "Hallo Frau ";
			break;
		case 2:
			title = "Hallo Herr ";
			break;
		case 3:
			title = "Hallo ";
			System.out.println("Type your first name: ");
			name += " " + strReader.nextLine();
			break;
		default:
			System.out.println("Invalid input");
		}
		
		System.out.println(title + name);*/
		
/*		printHowMany(" ", 1);
		printHowMany("_", 13);
		printHowMany("\n", 1);
		printHowMany("< Java rocks! >\n", 1);
		printHowMany("-", 15);
		printHowMany("\n\t\\    ^__^\n", 1);
		printHowMany(" ", 9);
		printHowMany("\\   (oo)\\", 1);
		printHowMany("_", 7);
		printHowMany("\n             (__)\\       )\\/\\\n", 1);
		printHowMany(" ", 17);
		printHowMany("||", 1);
		printHowMany("-", 4);
		printHowMany("w |\n", 1);
		printHowMany(" ", 17);
		printHowMany("||", 1);
		printHowMany(" ", 5);
		printHowMany("||", 1);*/
	}
	
	
/*	static void printHowMany(String symbol, int amount) {
		if(amount != 1) {
			for(int i = 0; i < amount; i++) {
				System.out.print(symbol);
			}
		} else {
			System.out.print(symbol);
		}
	}
*/
	static void recieptInOut() {
		System.out.println("Enter an ammount of items: ");
		ammount = intReader.nextInt();
		
		System.out.println("Enter an item and the price: ");
		String item = strReader.nextLine();
		Double price = doubleReader.nextDouble();
		
		for(int i = 0; i > ammount; i++) {
			items[i] += item;
			prices[i] += price;
		}
	}
}