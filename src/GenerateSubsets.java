import java.util.*;

public class GenerateSubsets {
    private static void generatePermutations(String str, String prefix, List<String> subsets) {
        if (str.length() == 0) {
            subsets.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + ch, subsets);
            }
        }
    }

    private static void solve(String str) {
        List<String> li = new ArrayList<>();
        generatePermutations(str, "", li);

        Collections.sort(li);

        for(String s : li) {
            if(s.compareTo(str) < 0) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        solve(str);
    }
}
