
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs;
		strs = new String[] {"flower", "flow", "flight"};
//		strs = null;
		String prefix;
		
		Solution solution = new Solution();
		
		prefix = solution.longestCommonPrefix(strs);
		System.out.println(prefix);
		
	}

}
