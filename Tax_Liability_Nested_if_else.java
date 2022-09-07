package javaProject1.pack1;

import java.util.Scanner;

public class Tax_Liability_Nested_if_else {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Age: ");
		int age=sn.nextInt();
		System.out.print("Income: ");
		int income=sn.nextInt();
		if(age<18)
			System.out.println("Income is taxable in the hands of parent.");
		else {
			if(age>79) {
				if(income<=500000)
					System.out.println("As the income is below the threshold limit-Rs.5,00,000, not required to pay tax.");
				else
					System.out.println("Required to pay tax for the income exceeding Rs.5,00,000");
			}
			else {
				if(age>59) {
					if(income<=300000)
						System.out.println("As the income is below the threshold limit-Rs.3,00,000, not required to pay tax.");
					else
						System.out.println("Required to pay tax for the income exceeding Rs.3,00,000");
				}
				else {
					if(income<=250000)
						System.out.println("As the income is below the threshold limit-Rs.2,50,000, not required to pay tax.");
					else
						System.out.println("Required to pay tax for the income exceeding Rs.2,50,000");
				}
			}
		}
	}
}
