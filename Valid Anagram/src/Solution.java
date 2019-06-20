class Solution {
	public boolean isAnagram(String s, String t) {
		int lengthofs = s.length();
		int lengthoft = t.length();
		
		if(lengthofs != lengthoft) {
			return false;
		}
		
		int[] chs = new int[26];
		int[] cht = new int[26];
		
		for(int i = 0; i < lengthofs; i++) {
			chs[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < lengthoft; i++) {
			cht[t.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(chs[i] != cht[i]) {
				return false;
			}
		}
		
		return true;
	}
}
