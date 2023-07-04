
class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {

        // Return an empty string if any of the conditions are met
        int n = strarr.length;
        if (n == 0 || k > n || k <= 0) {
            return "";
        }

        // Initialize a StringBuilder to store the longest concatenated string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n - k; i++) {
            // Initialize a StringBuilder for the current group of strings
            StringBuilder currentStr = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                // Append each string from the current group to currentStr
                currentStr.append(strarr[j]);
            }
            if (currentStr.length() > result.length()) {
                // Update longestStr if currentStr is longer
                result = currentStr;
            }
        }
        // Convert the StringBuilder to a string and return the longest concatenated string
        return result.toString(); 
    }
}

/*

You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.

Examples:
strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2

Concatenate the consecutive strings of strarr by 2, we get:

treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]

Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
The first that came is "folingtrashy" so 
longest_consec(strarr, 2) should return "folingtrashy".

In the same way:
longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
n being the length of the string array, if n = 0 or k > n or k <= 0 return "" (return Nothing in Elm, "nothing" in Erlang).

 */