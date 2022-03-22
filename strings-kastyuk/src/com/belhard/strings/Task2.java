package com.belhard.strings;

public class Task2 {

	public static void main(String[] args) {
		
		String input = DemoStrings_Task2.blackToWhiteTransformation;
		String output = input.replaceAll("(?i)black\\w{0}", "white");
		
		System.out.println("~~~Source text: \n" + input);
		System.out.println();
		System.out.println("~~~TransformatedText: \n" + output);
	}
}

class DemoStrings_Task2 {
	public static final String blackToWhiteTransformation = 
			"black & BLACK\n" + 
			"blackboard & blackberry\n" +
			"i like BLack color";
			
	public static final String[] TASK2 = { blackToWhiteTransformation };
}