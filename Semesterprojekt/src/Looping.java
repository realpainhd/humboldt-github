import java.math.BigInteger;

public class Looping {

	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		count = Math.abs(count);
		if (count > 100000) {
			System.out.println("Zahl zu groß!");
			System.exit(0);
		} else {
			for (int i = 1; i <= count; i++) {
				// System.out.println(i);
				try {
					pal(i, reverse(i));
				} catch (Exception e) {
					System.out.println(i);
				}
			}
		}
		// long N = Long.parseLong(args[0]);
		// long R = reverse(N);
		// System.out.println(pal(N,R));

		long N = Integer.parseInt(args[0]);
		long R = reverse(N);
		System.out.println(N);
		System.out.println(R);
		long t = N + R;
		System.out.println("Ist die zahl ein Palindrom?: " + checkPal(t));

	}

	public static long reverse(long num) {
		String s1 = Long.toString(num);
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}

		long numr = 0;
		try {
			numr = Long.parseLong(s2);
		} catch (NumberFormatException e) {

		}

		numr = Long.parseLong(s2);


		return numr;

	}

	public static boolean checkPal(long t) {
		long x = t;
		long y = reverse(t);
		if (x == y) {
			return true;
		}
		return false;
	}

	public static boolean pal(long N, long R) {
		long t = 0;
		t = Math.addExact(R, N);

		if (checkPal(Math.addExact(R, N))) {
			return true;
		}
		return pal(Math.addExact(N, R), reverse(Math.addExact(N, R)));
		
	}



}
