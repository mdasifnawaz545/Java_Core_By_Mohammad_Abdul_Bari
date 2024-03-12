public class MaxArray {
    static void findMax(int arr[]) {
        int max = 0;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println("Max of the given array is " + max);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 7, 4, 9 };
        findMax(arr);
    }
}