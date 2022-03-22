package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {
		for(int i = 0; i < DemoStrings_Task3.TASK3.length; i++) {
			
			System.out.println("~~~Source text: \n" + DemoStrings_Task3.TASK3[i]);
			System.out.println();
		}
		
		countNums(DemoStrings_Task3.countNumbers);
	}

	private static void countNums(String countnumbers) {
		Pattern regex = Pattern.compile("\\d+");
		Matcher matcher = regex.matcher(DemoStrings_Task3.countNumbers);
		
		while (matcher.find()) {
			int nums = 0;
			nums += Integer.parseInt(matcher.group());
			System.out.println("~~~Numbers from out string: \n" + nums);
		}
	}
}

class DemoStrings_Task3 {
	public static final String countNumbers = 
			"we have 15 pens and 30 pensils, so we should buy 55 new pens and 40 new pensils";
			
	public static final String[] TASK3 = { countNumbers };
}
