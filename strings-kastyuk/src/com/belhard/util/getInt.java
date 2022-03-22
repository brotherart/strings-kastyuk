package com.belhard.util;

import java.util.Scanner;

public class getInt {

	public static int getIntFromConsole(int defaultValue, String varName) {
		
		Scanner scanner = new Scanner (System.in);

		System.out.print("Please, enter " + varName + ": ");
		
		int num; 
		
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();		
		} 
		else {
			num = defaultValue;
			System.out.println("Set to default: " + num);
		}

		return num;
	}

}
