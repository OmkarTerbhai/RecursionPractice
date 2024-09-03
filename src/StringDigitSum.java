import java.util.Scanner;

public class StringDigitSum {

    private static int f(String str, int idx) {
        if(idx == str.length()-1)
            return Integer.parseInt(str.substring(idx, idx+1));

        return Integer.parseInt(str.substring(idx, idx+1)) +
                f(str, idx+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(f(s, 0));
    }
}
