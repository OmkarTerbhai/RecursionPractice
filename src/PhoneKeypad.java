import java.util.Scanner;

public class PhoneKeypad {
    static String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqr"};

    private static void generateText(String keyPress, int idx, String output) {
        if(idx == keyPress.length()) {
            System.out.println(output);
            return;
        }

        int currKeyPress = Integer.parseInt(keyPress.substring(idx, idx+1));

        for(int i = 0; i < 3; i++) {
            generateText(keyPress, idx+1, output + keys[currKeyPress].charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        generateText(str, 0, "");
    }
}
