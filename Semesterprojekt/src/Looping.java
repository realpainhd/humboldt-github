
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
					pal(i, reverse(i), i);	
				} catch (Exception e) {
					System.out.println(i);
				}
			}
		}
		// long N = Long.parseLong(args[0]);
		// long R = reverse(N);
		// System.out.println(pal(N,R));

	}

	public static long reverse(long num) {
		String s1 = Long.toString(num);
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		int l = s2.length() - 1;

		long numr = 0;
		try {
			numr = Long.parseLong(s2);
		} catch (NumberFormatException e) {

		}
		// long numr = Long.parseLong(s2);

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

	public static boolean pal(long N, long R, int count) {
		long t = 0;
		t = Math.addExact(N, R);

		if (checkPal(Math.addExact(N, R))) {
			// System.out.print("\t" + "N: " + N + " R: " + R + " Palindrom?: " + t);
			return true;
		}
		/*
		 * if (checkPal(N+R)) { System.out.print("\t" + "N: " + N + " R: " + R +
		 * " Palindrom?: " + t); return true; }
		 */

		// System.err.print("false");
		// System.out.println("\t" + "N: " + N + " R: " + R + " Palindrom?: " + t);
		return pal(Math.addExact(N, R), reverse(Math.addExact(N, R)), count);
	}

}
