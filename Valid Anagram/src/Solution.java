class Solution {
	public boolean isAnagram(String s, String t) {
		int lengthofs = s.length();
		int lengthoft = t.length();

		if (lengthofs != lengthoft) {
			return false;
		}

		int left = 0;
		int right = lengthofs - 1;

		StringBuffer $s = new StringBuffer(s);
		StringBuffer $t = new StringBuffer(t);
		sort($s, left, right);
		sort($t, left, right);

		for (int i = 0; i < lengthofs; i++) {
			if ($s.charAt(i) != $t.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	private StringBuffer sort(StringBuffer str, int l, int r) {

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

	private int Partition(StringBuffer str, int left, int right) {
		int l = left;
		int r = right;

		char temp = str.charAt(r);

		while (l != r) {
			while (str.charAt(l) <= temp && r > l) {
				l++;
			}
			if (l < r) {
				str.setCharAt(r, str.charAt(l));
				r--;
			}

			while (str.charAt(r) >= temp && r > l) {
				r--;
			}

			if (l < r) {
				str.setCharAt(l, str.charAt(r));
				l++;
			}

		}
		str.setCharAt(l, temp);
		return l;
	}

	private StringBuffer swap(StringBuffer str, int i, int j) {
		char temp;

		temp = str.charAt(i);
		str.setCharAt(i, str.charAt(j));
		str.setCharAt(j, temp);

		return str;
	}
}
