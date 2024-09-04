import java.util.Scanner;

public class EliminateX {

    private static String f(String str, int idx) {
        if(idx == str.length() - 1)
            return str.substring(idx, idx+1);

        if(str.charAt(idx) == 'x') {
            return f(str, idx+1);
        }
        return str.charAt(idx) + f(str, idx+1);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(f(str, 0));
    }
}
