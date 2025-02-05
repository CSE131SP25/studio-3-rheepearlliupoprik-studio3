package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("What number n do you want to find prime numbers to?");
		int n = in.nextInt();

		boolean[] a = new boolean[n+1];
		for (int j = 2; j < n; j++) {
			for (int i = j+j; i <= n; i = i + j) {


				a[i] = true; }
			}
		for (int m = 2; m < a.length; m++) {
			if (a [m] == false) {
				System.out.println(m);
			}
		}
	}

}

