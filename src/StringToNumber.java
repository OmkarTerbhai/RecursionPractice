import java.util.Scanner;

public class StringToNumber {

    private static int solve(String str, int iMultiplier, int idx) {
        if(idx == str.length()-1) {
            return Integer.parseInt(str.substring(idx, idx+1));
        }

        return (iMultiplier * Integer.parseInt(str.substring(idx, idx+1)) + solve(str, iMultiplier / 10, idx+1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solve(str, (int) Math.pow(10, str.length()-1), 0));
    }
}
