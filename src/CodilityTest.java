public class CodilityTest {

	public static void main(String[] args) {

		System.out.println(solution(2, 17));
		System.out.println(solution2("We test coders. Give us a try?"));
	}

	//Function checks if a given input is a perfect square
	public static boolean isPerfectSquare(long i) {
		long currsqrt = (long) Math.sqrt(i * 1.0);
		if (currsqrt * currsqrt == i) {
			return true;
		}
		return false;
	}

	/* Function calculates the number of perfect squares in an interval [A,B]
	 * For ex. If A=4 and B=17 , the perfect squares are 4, 9, and 16
	 *  therefore the perfectSquareCount=3
	 */
	public static int solution(int A, int B) {
		int perfectsquareCount = 0;

		for (int i = A; i <= B; i++) {
			if (isPerfectSquare(i)) {
				perfectsquareCount++;
			}
		}
		return perfectsquareCount;
	}
	
	
/*Returns the count of words for the sentence with the most amount of
 * words in a Given String
 *let S = "We test coders. Give us a try?" Answer will be 4
 * We test coders=3
 * Give us a try=4
 * 3<4
 */

	public static int solution2(String S) {
		int curCount = 0;
		int highestCount = 0;

		//Checks for punctuation, and interprets them as a new sentence
		for (int i = 0; i < S.length(); i++) {
			if (S.substring(i, i + 1).equals(".")
					|| S.substring(i, i + 1).equals("?")
					|| S.substring(i, i + 1).equals("!")) {
				//Compares the highest word count to the current count 
				if (curCount > highestCount) {
					highestCount = curCount;
					curCount = 0;
				}
				//Checks for Space between words and increment word count
			} else if (S.substring(i, i + 1).equals(" ")) {

				curCount++;

			}
		}

		return highestCount;
	}

}
