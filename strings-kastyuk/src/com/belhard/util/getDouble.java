package com.belhard.util;

import java.util.Scanner;

public class getDouble {

	public static double getDoubleFromConsole(double defaultValue, String varName) {
		
		Scanner scanner = new Scanner (System.in);

		System.out.print("Please, enter " + varName + ": ");
		
		double num; 
		
		if (scanner.hasNextDouble()) {
			num = scanner.nextDouble();		
		} 
		else {
			num = defaultValue;
			System.out.println("Set to default: " + num);
		}
		
		return num;
	}

}
