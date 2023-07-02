public class MaximumProduct {
    public int adjacentElementsProduct(int[] array) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > max) {
                max = array[i] * array[i + 1];
            }
        }
        return max;
    }
}

/*
Task
Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.

Notes
Array/list size is at least 2.

Array/list numbers could be a mixture of positives, negatives also zeroes .

Input >> Output Examples
adjacentElementsProduct([1, 2, 3]); ==> return 6
Explanation:
The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array
 */