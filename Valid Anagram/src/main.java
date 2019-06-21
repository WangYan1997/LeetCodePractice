
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "anagram";
//		String t = "nagaram";
		
		String s = "rat";
		String t = "car";
		
		Solution solution = new Solution();
		boolean isAnagram = solution.isAnagram(s, t);
		
		System.out.println(isAnagram);
	}

}
