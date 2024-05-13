import java.util.Scanner;

public class string {

	public static void main(String[] args) {

		int upperCaseCounter = 0;
		int lowerCaseCounter = 0;
		int digitCounter = 0;
		int whiteSpaceCounter = 0;
		int specialCounter = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type any sentence: ");
		String sentence = scan.nextLine();
		
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCaseCounter++;
				} else {
					lowerCaseCounter++;
				}
			} else if (Character.isDigit(ch)) {
				digitCounter++;
			} else {
				if (Character.isWhitespace(ch)) {
					whiteSpaceCounter++;
				} else {
					specialCounter++;
				}
			}
		}
		
		System.out.println("The length of the sentence is " + sentence.length());
		System.out.println("The number of upper case letters are: " + upperCaseCounter);
		System.out.println("The number of lower case letters are: " + lowerCaseCounter);
		System.out.println("The number of digits are: " + digitCounter);
		System.out.println("The number of spaces are: " + whiteSpaceCounter);
		System.out.println("The number of special characters are: " + specialCounter);
		
	}

}
