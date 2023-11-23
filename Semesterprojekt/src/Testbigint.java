import java.math.BigInteger;

public class Testbigint {

	public static void main(String[] args) {
		BigInteger bil = BigInteger.ZERO.setBit(64);
		Long x = Long.MAX_VALUE;
		BigInteger bil2 = BigInteger.ZERO.setBit(128);
		System.out.println(bil.max(bil));
		System.out.println(Long.MAX_VALUE);
		
	}

}
