public class maxdiff {

    public static int maxDiff(int[] lst) {

        if (lst == null || lst.length <= 1) {
            return 0; // Return 0 if the list is empty or contains a single element
        }

        int largest = lst[0];
        int smallest = lst[0];

        for (int i = 0; i < lst.length; i++) {
            if (lst[i] >= largest) {
                largest = lst[i];
            } else if (lst[i] <= smallest) {
                smallest = lst[i];
            }
        }
        return largest - smallest;
    }
}