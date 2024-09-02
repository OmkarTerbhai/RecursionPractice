import java.util.Scanner;

class ArrayMax {

    private static int arrayMax(int[] arr, int idx) {
        if(idx >= arr.length) {
            return 0;
        }

        return Math.max(arr[idx], arrayMax(arr, idx+1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(arrayMax(arr, 0));
    }
}