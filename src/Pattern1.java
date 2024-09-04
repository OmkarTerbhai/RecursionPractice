import java.util.Scanner;

public class Pattern1 {

    private static void print(int i, int j, int n) {
        if(i > n)
            return;
        if(j > n) {
            System.out.println();
            print(i+1, 1, n);
            return;
        }

        System.out.print("* ");
        print(i, j+1, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        print(1, 1, n);
    }
}
