
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = {1,6,10};
		int[] s = {1,3,4,6,10};
		
		Solution solution = new Solution();
		int count = solution.findContentChildren(g, s);
		System.out.print(count);
	}

}
