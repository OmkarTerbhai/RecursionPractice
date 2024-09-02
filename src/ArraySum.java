import java.util.Scanner;

public class ArraySum {

    private static int arraySum(int[] arr, int idx) {
        if(idx >= arr.length) {
            return 0;
        }

        return arr[idx] + arraySum(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(arraySum(arr, 0));
    }
}
