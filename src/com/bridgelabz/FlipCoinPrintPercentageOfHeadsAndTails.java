package com.bridgelabz;
import java.util.Scanner;
public class FlipCoinPrintPercentageOfHeadsAndTails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of time you want to flip a coin : ");
		int numOfFlips = scanner.nextInt();
		scanner.close();
		//method to flip a coin
		flip(numOfFlips);
	}
	 
	public static void flip(int numOfFlips) 
	{
		if (numOfFlips <= 0) 
		{
			System.err.println("Please enter a postive integer");
		}

		else 
		{
			int numOfHeads = 0;
			for (int i = 0; i < numOfFlips; i++) 
			{
				//generating a random number between 0 and 1
				if (Math.random() > 0.5) 
				{
					numOfHeads++;
				}
			}
			double percentOfHeads = (numOfHeads*100)/numOfFlips;
			double percentOfTails = 100-percentOfHeads;
			System.out.println("heads percentage : "+ percentOfHeads);
			System.out.println("Tails percentage : "+ percentOfTails);
		}
	}

}
