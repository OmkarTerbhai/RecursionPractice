import java.util.Scanner;

public class FriendPairs {

    private static int f(int n) {
        if(n == 1 || n == 2) return n;

        return f(n-1) + (n-1) * f(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(f(n));
    }
}
