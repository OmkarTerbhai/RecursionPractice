import java.util.Scanner;

public class GenerateSubstring {

    private static void printSubstrings(String str, int idx, String sub) {
        if(idx == str.length()) {
            System.out.println(sub);
            return;
        }
        printSubstrings(str, idx+1, sub + str.charAt(idx));
        System.out.println(sub);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        printSubstrings(str, 0, "");
    }
}
