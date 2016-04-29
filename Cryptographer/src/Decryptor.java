public class Decryptor
	{
		public static void main(String[] args)
			{
				replaceLetters();
			}
		public static void replaceLetters()
		{
			Encryptor.sentence = Encryptor.sentence.replace("b", "Z");
			Encryptor.sentence = Encryptor.sentence.replace("a", "Y");
			Encryptor.sentence = Encryptor.sentence.replace("z", "X");
			Encryptor.sentence = Encryptor.sentence.replace("y", "W");
			Encryptor.sentence = Encryptor.sentence.replace("x", "V");
			Encryptor.sentence = Encryptor.sentence.replace("w", "U");
			Encryptor.sentence = Encryptor.sentence.replace("v", "T");
			Encryptor.sentence = Encryptor.sentence.replace("u", "S");
			Encryptor.sentence = Encryptor.sentence.replace("t", "R");
			Encryptor.sentence = Encryptor.sentence.replace("s", "Q");
			Encryptor.sentence = Encryptor.sentence.replace("r", "P");
			Encryptor.sentence = Encryptor.sentence.replace("q", "O");
			Encryptor.sentence = Encryptor.sentence.replace("p", "N");
			Encryptor.sentence = Encryptor.sentence.replace("o", "M");
			Encryptor.sentence = Encryptor.sentence.replace("n", "L");
			Encryptor.sentence = Encryptor.sentence.replace("m", "K");
			Encryptor.sentence = Encryptor.sentence.replace("l", "J");
			Encryptor.sentence = Encryptor.sentence.replace("k", "I");
			Encryptor.sentence = Encryptor.sentence.replace("j", "H");
			Encryptor.sentence = Encryptor.sentence.replace("i", "G");
			Encryptor.sentence = Encryptor.sentence.replace("h", "F");
			Encryptor.sentence = Encryptor.sentence.replace("g", "E");
			Encryptor.sentence = Encryptor.sentence.replace("f", "D");
			Encryptor.sentence = Encryptor.sentence.replace("e", "C");
			Encryptor.sentence = Encryptor.sentence.replace("d", "B");
			Encryptor.sentence = Encryptor.sentence.replace("c", "A");
			Encryptor.sentence = Encryptor.sentence.replace("!", "a");
			Encryptor.sentence = Encryptor.sentence.replace("@", "b");
			Encryptor.sentence = Encryptor.sentence.replace("#", "c");
			Encryptor.sentence = Encryptor.sentence.replace("$", "d");
			Encryptor.sentence = Encryptor.sentence.replace("%", "e");
			Encryptor.sentence = Encryptor.sentence.replace("^", "f");
			Encryptor.sentence = Encryptor.sentence.replace("&", "g");
			Encryptor.sentence = Encryptor.sentence.replace("*", "h");
			Encryptor.sentence = Encryptor.sentence.replace("(", "i");
			Encryptor.sentence = Encryptor.sentence.replace(")", "j");
			Encryptor.sentence = Encryptor.sentence.replace("-", "k");
			Encryptor.sentence = Encryptor.sentence.replace("_", "l");
			Encryptor.sentence = Encryptor.sentence.replace("=", "m");
			Encryptor.sentence = Encryptor.sentence.replace("+", "n");
			Encryptor.sentence = Encryptor.sentence.replace("[", "o");
			Encryptor.sentence = Encryptor.sentence.replace("]", "p");
			Encryptor.sentence = Encryptor.sentence.replace("{", "q");
			Encryptor.sentence = Encryptor.sentence.replace("}", "r");
			Encryptor.sentence = Encryptor.sentence.replace(":", "s");
			Encryptor.sentence = Encryptor.sentence.replace("|", "t");
			Encryptor.sentence = Encryptor.sentence.replace(";", "u");
			Encryptor.sentence = Encryptor.sentence.replace("'", "v");
			Encryptor.sentence = Encryptor.sentence.replace("<", "w");
			Encryptor.sentence = Encryptor.sentence.replace(">", "x");
			Encryptor.sentence = Encryptor.sentence.replace("?", "y");
			Encryptor.sentence = Encryptor.sentence.replace("~", "z");
			Encryptor.sentence = Encryptor.sentence.replace("46290", " ");
			System.out.println("Here is your sentence... " + Encryptor.sentence);
		}

	}