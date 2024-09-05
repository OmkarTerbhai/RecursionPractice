public class GenerateLexicographic {

    private static void generate(int i, int n) {
        if(i > n)
            return;
        else {
            if (i != 0)
                System.out.println(i);

        }

         for(int k = 0; k <= 9; k++) {
             if(k == 0) continue;
             generate(10 * i + k, n);
         }
    }
    public static void main(String[] args) {
        generate(0, 17);
    }
}
