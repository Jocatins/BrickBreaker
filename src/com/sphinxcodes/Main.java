package com.sphinxcodes;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number : ");
		int number = scanner.nextInt();
		
		if(number % 5 == 0 && number % 3 == 0)
			System.out.println("Jocatins");


		else if (number % 3 == 0 )
			System.out.println("tins");
		else if (number % 5 == 0)
			System.out.println("Joca");
		else
			System.out.println(number);

    }
}
