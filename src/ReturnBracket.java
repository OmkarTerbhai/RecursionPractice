import java.util.Scanner;

public class ReturnBracket {

    private static String solve(String str, int i, int j) {
        if(i >= j)
            return null;
        if(str.charAt(i) == '(' && str.charAt(j) == ')') {
            return str.substring(i+1, j);
        }

        return solve(str, i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solve(str, 0, str.length()-1));
    }
}
