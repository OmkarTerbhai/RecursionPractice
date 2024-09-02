import java.util.Scanner;

public class Factorial {

	private static int f(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * f(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(f(n));
	}

}
