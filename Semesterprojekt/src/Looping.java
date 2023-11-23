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
					pal(BigInteger.valueOf(i), reverse(BigInteger.valueOf(i)));
				} catch (Exception e) {
					System.out.println(i);
				}
			}
		}
		// long N = Long.parseLong(args[0]);
		// long R = reverse(N);
		// System.out.println(pal(N,R));

	}

	public static BigInteger reverse(BigInteger num) {
		String s1 = num.toString();
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}

		BigInteger numr = BigInteger.ZERO.setBit(128);
		try {
			numr = new BigInteger(s2);
		} catch (NumberFormatException e) {

		}

		return numr;
	}

	public static boolean checkPal(BigInteger t) {
		BigInteger x = t;
		BigInteger y = reverse(t);
		if (x == y) {
			return true;
		}
		return false;
	}

	public static boolean pal(BigInteger N, BigInteger R) {
		BigInteger t = BigInteger.ZERO.setBit(128);
		t = N.add(R);

		if (checkPal(N.and(R))) {
			return true;
		}
		return pal(N.add(R), reverse(N.add(R)));
		//need to fix github
	}


}
