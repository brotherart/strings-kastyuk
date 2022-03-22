package com.belhard.strings;

public class Task1 {

	public static String[] transformationToSnakeCase(String[] camelCase) {
		String [] snakeCase = new String[camelCase.length];
		for (int i = 0; i < snakeCase.length; i++) {
			StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
            	char letter = camelCase[i].toCharArray()[j];
            	if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } 
            	else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
		return snakeCase;
	}

	public static void main(String[] args) {
		for	(int i = 0; i < DemoStrings_Task1.TASK1.length; i++) {
			String [] camelCase = DemoStrings_Task1.TASK1;
			String [] snakeCase = transformationToSnakeCase(camelCase);
			
			System.out.println("~~~Source text: \n" + DemoStrings_Task1.TASK1[i]);
			System.out.println();
			System.out.println("~~~TransformatedText: \n" + String.join(", ", snakeCase));
		}
	}
}

class DemoStrings_Task1 {
	public static final String camelCaseTransformation = 
			"tipicalExampleOfCamelCase\n" + 
			"exampleWITHCapsLock\n" + 
			"examplewithoutcaps";
			
	public static final String[] TASK1 = { camelCaseTransformation };
}
