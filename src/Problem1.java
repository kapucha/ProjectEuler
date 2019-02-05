import java.util.stream.IntStream;

public class Problem1 {

	private static int getSumOfTheMultiplies3And5(int limit) {
		int result = 0;
		for (int i = 3; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		return result;
	}

	private static int getSumOfMultipliesInRange(int a, int b) {
		return IntStream.range(a, b).filter(no -> (no % 3 == 0 || no % 5 == 0)).sum();
	}

	// private static int getSumOfMultipliesInRangeWithMap(int a, int b) {
	// return IntStream.range(a, b).map(no -> (no % 3 == 0 || no % 5 == 0));
	// }

	public static void main(String[] args) {
		System.out.println(Problem1.getSumOfTheMultiplies3And5(1000));
		System.out.println(Problem1.getSumOfMultipliesInRange(3, 1000));
	}

}
