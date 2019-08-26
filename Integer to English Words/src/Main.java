
public class Main {
	public static void main(String[] args) {
//		int input = 2147483647;
//		int input = 0;
//		int[] input = {0, 1, 2, 9, 10, 11, 15, 19, 20, 21, 39, 50, 99, 100, 101, 102, 105, 110, 111, 117, 120, 121, 139, 150, 299, 999};
		int[] input = {50868, 2147483647, 1234567891, 1234567, 12345, 10111, 10100, 10010, 10001, 10000, 9999, 1200, 1101, 1010, 1001};
		
		Solution s = new Solution();
		
		for(int i : input) {
			String str = s.numberToWords(i);
			System.out.println(i + ":" + str);
		}

		
		
//		System.out.print(input / 1e9);
	}
}
