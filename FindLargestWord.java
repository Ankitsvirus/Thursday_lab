package test7;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

	public class FindLargestWord  {
	    public static void main(String [ ] args) throws FileNotFoundException 
		{
	        new FindLargestWord ().findLongestWords();
	    }

	    public String findLongestWords() throws FileNotFoundException 
		{
			String longest_word = "";
			String current;
			Scanner sc = new Scanner(new File("F:\\Ankit.txt"));

			while (sc.hasNext()) 
			{
				current = sc.next();
				if (current.length() > longest_word.length()) 
				{
					longest_word = current;
				}

			}
			System.out.println("\n largest work is = " +longest_word+ "\n");
	        return longest_word;
		}
	}

