import java.util.Scanner;

public class PalindromicRecursion {

    private static boolean isPalindrome(String str, int i, int j) {
        if(i >= j) return true;

        if(str.charAt(i) == str.charAt(j))
            return isPalindrome(str, i+1, j-1);
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
