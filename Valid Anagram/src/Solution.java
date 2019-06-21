class Solution {
		public boolean isAnagram(String s, String t) {
		
        int Ls = s.length();
        int Lt = t.length();
		if(Ls != Lt) {
			return false;
		}
		
		int[] ch = new int[26];
		
		for(int i = 0; i < Ls; i++) {
			ch[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < Lt; i++) {
			ch[t.charAt(i) - 'a']--;
            if(ch[t.charAt(i) - 'a'] < 0){
                return false;
            } 
		}
		
		return true;
	}
}
