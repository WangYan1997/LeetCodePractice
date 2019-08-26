
public class Solution {
	public int[] sortArray(int[] nums) {
		sort(nums, 0, nums.length - 1);
		return nums;
	}

	public void sort(int[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int lt = lo, i = lo + 1, gt = hi;
		int v = a[lo];
		while (i <= gt) {
			int cmp = a[i] - v;
			if (cmp < 0) {
				exch(a, lt++, i++);
			} else if (cmp > 0) {
				exch(a, i, gt--);
			} else {
				i++;
			}

		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}

	private void exch(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
