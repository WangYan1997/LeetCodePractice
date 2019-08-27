
public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		if (x >= 0 && x < 10) {
			return true;
		}

		int y = 0, temp = x;
		while (temp > 0) {
			y = y * 10 + temp % 10;
			temp = temp / 10;
		}

		return y == x;
	}
}
