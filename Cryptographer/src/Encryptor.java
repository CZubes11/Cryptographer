import java.util.Scanner;
public class Encryptor
	{
		static Scanner userInput = new Scanner(System.in);
		static String sentence;
		public static void main(String[] args)
			{
				askForSentence();
				replaceLetters();
			}
		public static void askForSentence()
			{
				System.out.println("Please type a sentence you would like encrypted!");
				sentence = userInput.nextLine();
			}
		public static void replaceLetters()
			{
				sentence = sentence.replace("a", "!");
				sentence = sentence.replace("b", "@");
				sentence = sentence.replace("c", "#");
				sentence = sentence.replace("d", "$");
				sentence = sentence.replace("e", "%");
				sentence = sentence.replace("f", "^");
				sentence = sentence.replace("g", "&");
				sentence = sentence.replace("h", "*");
				sentence = sentence.replace("i", "(");
				sentence = sentence.replace("j", ")");
				sentence = sentence.replace("k", "-");
				sentence = sentence.replace("l", "_");
				sentence = sentence.replace("m", "=");
				sentence = sentence.replace("n", "+");
				sentence = sentence.replace("o", "[");
				sentence = sentence.replace("p", "]");
				sentence = sentence.replace("q", "{");
				sentence = sentence.replace("r", "}");
				sentence = sentence.replace("s", ":");
				sentence = sentence.replace("t", "|");
				sentence = sentence.replace("u", ";");
				sentence = sentence.replace("v", "'");
				sentence = sentence.replace("w", "<");
				sentence = sentence.replace("x", ">");
				sentence = sentence.replace("y", "?");
				sentence = sentence.replace("z", "~");
				sentence = sentence.replace(" ", "46290");
				sentence = sentence.replace("A", "c");
				sentence = sentence.replace("B", "d");
				sentence = sentence.replace("C", "e");
				sentence = sentence.replace("D", "f");
				sentence = sentence.replace("E", "g");
				sentence = sentence.replace("F", "h");
				sentence = sentence.replace("G", "i");
				sentence = sentence.replace("H", "j");
				sentence = sentence.replace("I", "k");
				sentence = sentence.replace("J", "l");
				sentence = sentence.replace("K", "m");
				sentence = sentence.replace("L", "n");
				sentence = sentence.replace("M", "o");
				sentence = sentence.replace("N", "p");
				sentence = sentence.replace("O", "q");
				sentence = sentence.replace("P", "r");
				sentence = sentence.replace("Q", "s");
				sentence = sentence.replace("R", "t");
				sentence = sentence.replace("S", "u");
				sentence = sentence.replace("T", "v");
				sentence = sentence.replace("U", "w");
				sentence = sentence.replace("V", "x");
				sentence = sentence.replace("W", "y");
				sentence = sentence.replace("X", "z");
				sentence = sentence.replace("Y", "a");
				sentence = sentence.replace("Z", "b");
				System.out.println("Here is your sentence... " + sentence);
			}
	}