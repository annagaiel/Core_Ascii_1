package one;

public class AsciiSymbols {
/**
 * Write a program to print the characters corresponding to ASCII codes from 65 to 90.
 * @param args
 */
	public static void main(String[] args) {
		int start_value = 65;
		int end_value = 90;
		for(int i = start_value; i <= end_value; i++){
			System.out.println(i+"-"+(char)i);
		}
	}

}
