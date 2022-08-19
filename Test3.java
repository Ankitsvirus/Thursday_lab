package labtest3;
import java.util.*;
public class Test3 {
	
	  
		public static void main(String arrgs[]) {
			String s="Vowels";
			char[] c=s.toCharArray();
			
			int Vowel=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
					Vowel++;
			}
			System.out.println("vowels:"+Vowel);
			}
		}



