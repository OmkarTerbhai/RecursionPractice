public class Pattern3 {
    private static void print(int i, int j, int n) {
        if(i >= n)
            return;
        if(j > i) {
            System.out.println();
            print(i+1, 0, n);
            return;
        }

        System.out.print(nCr(i, j) + " ");
        print(i, j+1, n);
    }

    private static int nCr(int i, int j) {
        if(j == 0) return 1;
        if(j == 1) return i;

        return fact(i) / (fact(j) * fact(i-j));
    }

    private static int fact(int i) {
        if(i == 0)
            return 1;

        return i * fact(i-1);
    }

    public static void main(String[] args) {
        print(0, 0, 6);
    }
}
