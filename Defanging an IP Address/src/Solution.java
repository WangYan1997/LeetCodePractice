class Solution {
	public String defangIPaddr(String address) {
		String res = "";
		char[] charArray = address.toCharArray();
		for (char a : charArray) {
			if (a == '.') {
				res += "[.]";
			} else {
				res += a;
			}
		}
		return res;
	}
}