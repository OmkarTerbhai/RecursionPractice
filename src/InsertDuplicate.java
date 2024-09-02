import java.util.Scanner;

public class InsertDuplicate {

    private static String solve(String str, int idx) {
        if(idx == str.length()-1) return str.substring(idx, idx+1);

        if(str.charAt(idx) == solve(str, idx+1).charAt(0))
            return str.charAt(idx) + "*" + solve(str, idx+1);
        return str.charAt(idx) + solve(str, idx+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solve(str, 0));
    }
}
