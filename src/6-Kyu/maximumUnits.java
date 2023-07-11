class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        // Sorting the array, then using the lambda expression to compare (essentially steps in as a comparator)
        // Sorts descending, and comapres a and b, the 2nd element of each one. 
        // By subtracting these elements it ensures that the array is sorted in a desceneding order. 
        // b[1] is greater, the result of the subtraction will be positive, and b will be considered greater than a, resulting in a descending order sorting.
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int total = 0; 

        for (int [] b : boxTypes) {
            int count = Math.min(b[0], truckSize);

            total += count * b[1];
            truckSize -= count;

            if (truckSize == 0) {
                return total;
            }
        }
        return total;
    }
}

/*
You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.

 

Example 1:

Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
Explanation: There are:
- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
 */