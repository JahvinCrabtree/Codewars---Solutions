public class encryptThis {
    public static String encryption(String text) {

        // Checking for emplty string.

        if (text == null || text.isEmpty()) {
            return "";
        }

        // Splitting the words into an array
        // Also creating the StringBuilder for later.
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        // For each loop to find each word that was previously split in the array.
        for (String word : words) {

            // convert char to ascii value if the word length is 1.
            if (word.length() == 1) {
                result.append((int) word.charAt(0));
                // if the word length is 2, directly append the ascii value and 2nd character.
            } else if (word.length() == 2) {
                result.append((int) word.charAt(0)).append(word.charAt(1));
                // This just then handles words larger than 2 characters.
            } else {
                int ascii = (int) word.charAt(0); // first char,
                char second = word.charAt(1); // second char.
                char last = word.charAt(word.length() - 1); // last char
                String middle = word.substring(2, word.length() - 1); // middle of the word.
                result.append(ascii).append(last).append(middle).append(second);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}

/*
Acknowledgments:
I thank yvonne-liu for the idea and for the example tests :)

Description:
Encrypt this!

You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter must be converted to its ASCII code.
The second letter must be switched with the last letter
Keepin' it simple: There are no special characters in the input.
Examples:
Kata.encryptThis("Hello") => "72olle"
Kata.encryptThis("good") => "103doo"
Kata.encryptThis("hello world") => "104olle 119drlo"

 */