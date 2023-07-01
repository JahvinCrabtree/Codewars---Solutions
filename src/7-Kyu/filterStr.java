public class filterStr {
    public static long filterString(final String str) {
        StringBuilder numberStr = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numberStr.append(c);
            }
        }
        
        if (numberStr.length() > 0) {
            return Integer.parseInt(numberStr.toString());
        }
        
        return -1; // Return -1 if no number is found in the string
    }
}

/*
Filter the number
Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text, can you return the number back to its original state?

Task
Your task is to return a number from a string.

Details
You will be given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they occur.
 */