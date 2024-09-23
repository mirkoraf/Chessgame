package hellostudent;

import java.util.Scanner;

public class Hellostudent {

	public static void main(String[] args) {
		/*
		 * String word = "Test";
		 * 
		 * word = word.toUpperCase(); System.out.println(word); word =
		 * word.toLowerCase(); System.out.println(word);
		 * 
		 * String str1 = "Mirko"; String str2 = "Raf";
		 */
		/*
		 * String sentence = "Hunde sind lieb";
		 * 
		 * String sentence_substring = sentence.substring(4, 9);
		 * 
		 * System.out.println(sentence_substring);
		 */

		/*
		 * byte[] myNewArray = new byte[7]; myNewArray[0] = 100;
		 * 
		 * System.out.println(myNewArray[0]);
		 * 
		 * String[] weekDays = {"Montag", "Dienstag", "Mitwoch"};
		 */
		/*
		 * String text = "Dies ist ein Text";
		 * System.out.println(text.replace(text.charAt(0), 'A')); int lastChar =
		 * text.length() -1; System.out.println(text.replace(text.charAt(lastChar),
		 * 'A'));
		 */
		/*
		 * int varA = 6; int varB = 6;
		 * 
		 * if (varA > varB) System.out.println(varA + " ist größer als " + varB); else
		 * if (varA < varB) System.out.println(varA + " ist kleiner als " + varB); else
		 * System.out.println(varA + "ist gleich " + varB);
		 */
	

	String operation ="";
	double ergebnis;
	boolean run = true;
	
	Scanner scanner = new Scanner(System.in);
	
	while(run)
		
	{
	
	System.out.println("Rechenart eingeben (+ | - | * | / ):");
	operation = scanner.nextLine();
	
	System.out.println("Erste Zahl eingeben:");
	double zahlA = Double.parseDouble(scanner.nextLine());
	
	System.out.println("Zweite Zahl eingeben:");
	double zahlB = Double.parseDouble(scanner.nextLine());
	
	
	
	switch (operation) {
	case "+": {
		ergebnis = zahlA + zahlB;
		System.out.println("Ergebnis ist: " + ergebnis );
		break;
	}
	
	case "-": {
		ergebnis = zahlA - zahlB;
		System.out.println("Ergebnis ist: " + ergebnis );
		break;
	}
	
	case "*": {
		ergebnis = zahlA * zahlB;
		System.out.println("Ergebnis ist: " + ergebnis );
		break;
	}
	
	case "/": {
		ergebnis = zahlA / zahlB;
		System.out.println("Ergebnis ist: " + ergebnis );
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + operation);
	}
	
	
	}
	
	}

}