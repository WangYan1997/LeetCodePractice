class Solution {
	public String longestCommonPrefix(String[] strs) {
		String prefix = "";

		if (strs == null || strs.length == 0) {
			return prefix;
		}
		for (int i = 0; i < strs[0].length(); i++) {
			boolean flag = true;
			char commonchar = strs[0].charAt(i);

			for (int k = 1; k < strs.length; k++) {
				if (i >= strs[k].length()) {
					return prefix;
				}
				if (strs[k].charAt(i) != commonchar) {
					flag = false;
				}
			}

			if (flag) {
				prefix = prefix + String.valueOf(commonchar);
			} else {
				break;
			}
		}

		return prefix;
	}
}
