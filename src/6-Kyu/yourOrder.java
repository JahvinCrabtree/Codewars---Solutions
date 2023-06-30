public class yourOrder {
    public static String order(String words) {

        // check base case (if words is an empty string, we return "")
        if (words.isEmpty()) {
            return "";
        }

        // assuming words is not empty, we are going to need to split the string up per
        // word and store in an array
        // we also will create another array the same size as our wordsArray, which will
        // store the sorted version of our string
        String[] wordsArray = words.split(" ");
        String[] sortedArray = new String[wordsArray.length];

        // for each word of wordsArray...
        for (int i = 0; i < wordsArray.length; i++) {
            // for each letter of each word...
            for (char c : wordsArray[i].toCharArray()) {
                // if the char we are looking at is a digit, we will fill the specific index of
                // our sorted array with this word according to the
                // value of the digit
                if (Character.isDigit(c)) {
                    int order = Character.getNumericValue(c); // we need to convert the char to an int so we can use the
                                                              // int to reference an array index
                    sortedArray[order - 1] = wordsArray[i]; // since the string input we get from the tests does not
                                                            // zero index, we need to make sure we are substracting by
                                                            // one since arrays zero-index
                }
            }
        }

        // using stringbuilder, we will construct a new string
        StringBuilder sb = new StringBuilder();
        // for each word in the now sorted array...
        for (int i = 0; i < sortedArray.length; i++) {
            // if it is the last word in the array, we want to only add the word with no
            // space after
            if (i == sortedArray.length - 1) {
                sb.append(sortedArray[i]);
                // for every other word in the array thats not the last, we want to append the
                // word plus a space
            } else {
                sb.append(sortedArray[i] + " ");
            }
        }

        // we still only have a stringbuilder, so we need to use toString to return a
        // string version of our stringbuilder

        return sb.toString();
    }
}

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */