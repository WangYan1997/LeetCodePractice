
public class Main {
	public static void main(String[] args) {
		int[] input = { 3, 1, 2, 4 };

		Solution s = new Solution();
		int[] output = s.sortArrayByParity(input);

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
	}
}
