import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(n >= 2 && n <= 20) {
			for(int i = 1; i <= 10; i++) {
				int res = n * i;
				System.out.println(n + " " + "x" + " " +i+ " "+ "=" + " " + res);
			}
		}
	}
}




