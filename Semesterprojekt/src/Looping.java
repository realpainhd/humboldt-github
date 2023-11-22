
public class Looping {

	public static void main(String[] args) {
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
		int numr = Integer.parseInt(s2);

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

}
