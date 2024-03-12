public class oldReverse {
    void reverse(int n) {
        int rem = 0, rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse numbe is : " + rev);
    }
    void reverse(int ...arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i : arr) {
            System.out.println("Reverse Array is : " + i);
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int num = 123;
        oldReverse or = new oldReverse();
        or.reverse(num);
        or.reverse(arr);
    }

}
