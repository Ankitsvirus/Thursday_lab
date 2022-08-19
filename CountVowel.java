package labtest3;

public class CountVowel {
	public int countVowels(char[] CharArr) {
		int count = 0;
		for (char ch : CharArr) {
		
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			try {
				if(ch=='x') {
					System.out.println("Checked Exception");
				}
			}catch(Exception e){
				System.out.println(e);
			}

		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowel obj = new CountVowel ();
		char[] CharArray = { 'a', 'b', 'c', 'd', 'e','x','o'};
		int countValueOfVowel = obj.countVowels(CharArray);
		System.out.println(countValueOfVowel);

	}

}