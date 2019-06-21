class Solution {
	public boolean isAnagram(String s, String t) {
		int lengthofs = s.length();
		int lengthoft = t.length();

		if (lengthofs != lengthoft) {
			return false;
		}

		int left = 0;
		int right = lengthofs - 1;

		char[] $s = s.toCharArray();
		char[] $t = t.toCharArray();
		sort($s, left, right);
		sort($t, left, right);

		for (int i = 0; i < lengthofs; i++) {
			if ($s[i] != $t[i]) {
				return false;
			}
		}

		return true;
	}

	private char[] sort(char[] str, int l, int r) {

		if (r <= l) {
			return str;
		}

		int pivot = (l + r) / 2;

		swap(str, pivot, r);
		pivot = Partition(str, l, r);
		sort(str, l, pivot - 1);
		sort(str, pivot + 1, r);

		return str;
	}

	private int Partition(char[] str, int left, int right) {
		int l = left;
		int r = right;

		char temp = str[r];

		while (l != r) {
			while (str[l] <= temp && r > l) {
				l++;
			}
			if (l < r) {
				str[r] = str[l];
				r--;
			}

			while (str[r]>= temp && r > l) {
				r--;
			}

			if (l < r) {
				str[l] = str[r];
				l++;
			}

		}
		str[l] = temp;
		return l;
	}

	private char[] swap(char[] str, int i, int j) {
		char temp;

		temp = str[i];
		str[i] = str[j];
		str[j] = temp;

		return str;
	}
}
