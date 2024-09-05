import java.util.Scanner;

public class Subsequence {

    private static void printSubsequences(String str, int idx, String sub) {
        if(idx == str.length()) {
            System.out.println(sub);
            return;
        }

        printSubsequences(str, idx+1, sub + str.charAt(idx));
        printSubsequences(str, idx+1, sub);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        printSubsequences(str, 0, "");
    }
}
