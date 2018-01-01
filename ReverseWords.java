public class ReverseWords {

	public static void main(String[] args) {
		// words to be reversed
		String message = "find you will pain only go you recordings security the into if";
		// convert to char array
		char[] messageToChar = message.toCharArray();
		String finalMessage = reverseWords(messageToChar);
		System.out.println(finalMessage);

	}

	private static String reverseWords(char[] messageToChar) {
		// reverse all characters but which gives right word order but with each
		// word backwards
		reverseCharacters(messageToChar, 0, messageToChar.length - 1);

		// we hold the index of the *start* of the current word
		// as we look for the *end* of the current word
		int currentWordStartIndex = 0;
		for (int i = 0; i <= messageToChar.length; i++) {
			// get the end of word
			if (i == messageToChar.length || messageToChar[i] == ' ') {
				reverseCharacters(messageToChar, currentWordStartIndex, i - 1);
				currentWordStartIndex = i + 1;
			}
		}
		return new String(messageToChar);

	}

	private static void reverseCharacters(char[] messageToChar, int startIndex,
			int endIndex) {

		// go towards the middle from both sides
		while (startIndex < endIndex) {

			// swap the front char and last char
			char tempChar = messageToChar[startIndex];
			messageToChar[startIndex] = messageToChar[endIndex];
			messageToChar[endIndex] = tempChar;
			startIndex++;
			endIndex--;
		}

	}

}
