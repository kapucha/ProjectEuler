
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

	public static void main(String[] args) {
		System.out.println(Problem1.getSumOfTheMultiplies3And5(1000));
	}

}
