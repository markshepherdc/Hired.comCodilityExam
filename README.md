# Hired.comCodilityExam
Num. of Perfect Squares in Interveal &amp; Count of words in longest sentence of a given string


Welcome to the HiredCodilityExam wiki!


![](https://github.com/markshepherdc/HiredCodilityExam/blob/master/Solution1.png)

```java
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


```java

![](https://github.com/markshepherdc/Hired.comCodilityExam/blob/master/Solution2.png)


```java
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

```java
