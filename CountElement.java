#Q-1 : given an array count number of elements having at least one element greater than itself.


import java.util.Scanner;

class CountElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < max) {
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
}


