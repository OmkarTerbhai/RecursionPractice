import java.util.Scanner;

public class OneToN {

	private static void print(int n) {
		if(n == 0) {
			return;
		}
		
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		print(n);

	}

}
