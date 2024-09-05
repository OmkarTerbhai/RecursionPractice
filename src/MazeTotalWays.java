import java.util.Scanner;

public class MazeTotalWays {

    private static int f(int i, int j, int n) {
        if(i > n-1 || j > n-1)
            return 0;
        if(i == n-1 && j == n-1)
            return 1;

        return f(i+1, j, n) + f(i, j+1, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(f(0, 0, n));
    }
}
