import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GenerateSubsetsII {

    private static void print(String str, List<String> ds, int[] mp) {
        if(ds.size() == str.length()) {
            for(String s : ds) {
                System.out.print(s);
            }
            System.out.println();
        }

        for(int i = 0; i < str.length(); i++) {
            if(mp[i] == -1) {
                ds.add(str.substring(i, i+1));
                mp[i] = 1;
                print(str, ds, mp);

                ds.remove(ds.size()-1);
                mp[i] = -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] mp = new int[str.length()];
        Arrays.fill(mp, -1);

        print(str, new ArrayList<>(), mp);
    }
}
