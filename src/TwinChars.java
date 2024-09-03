import java.util.Scanner;

public class TwinChars {
    static int cnt = 0;
    private static String f(String str, int idx) {
        if(idx == str.length() - 2)
            return str.substring(idx);

        String s = f(str, idx+1);
        if(str.charAt(idx) == s.charAt(1))
            cnt++;

        return str.charAt(idx) + s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        f(str, 0);
        System.out.println(cnt);
    }
}
