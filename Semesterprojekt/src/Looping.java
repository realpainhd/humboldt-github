
public class Looping {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int R = reverse(N);
		System.out.println(N);
		System.out.println(R);

	}

	public static int reverse(int num) {
		String s1 = Integer.toString(num);
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		int numr = Integer.parseInt(s2);

		return numr;

	}

	public static boolean checkPal(int n) {

		return false;
	}

}
