import java.util.Scanner;
public class Cryptographer 
{
	public static void main(String[] args) 
	{
		Encryptor.askForSentence();
		Encryptor.replaceLetters();
		Decryptor.replaceLetters();		
	}
}