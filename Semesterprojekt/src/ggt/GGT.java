package ggt;

import java.util.Scanner;

public class GGT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wert für a: ");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("nur positive Zahlen erlaubt!");
			System.exit(-1);
		}
		System.out.println("Wert für b: ");
		int b = sc.nextInt();
		if (b < 0) {
			System.out.println("nur positive Zahlen erlaubt!");
			System.exit(-1);
		}
		System.out.println("ggT von " + a + " und " + b + ": " + ggt(a, b));

	}

	public static int ggt(int a, int b) {
		int m = a;
		int n = b;
		int r = 0; // zwischenvariable
		int t1;
		int t2;
		
		
		if (m < n) {
			t2 = a;
			t1 = b;
			// System.out.println(m);
			// System.out.println(n);
		} else {
			t1 = a;
			t2 = b;
		}
		r = m - n;
		m = n;
		n = r;
		while (r != 0) {
			t1 = t2;
			t2 = r;
			r = t1 % t2;
		}
		return Math.abs(t2);
	}

}
