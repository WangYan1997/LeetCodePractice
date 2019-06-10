
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int N = 2;
//		int[][] trust = {{1,2}};
		
//		int N = 3;
//		int[][] trust = {{1,3}, {2,3}};
		
//		int N = 3;
//		int[][] trust = {{1,3}, {2,3}, {3,1}};
		
//		int N = 3;
//		int[][] trust = {{1,2}, {2,3}};
		
		int N = 4;
		int[][] trust = {{1,3}, {1,4}, {2,3}, {2,4}, {4,3}};
		
		Solution s = new Solution();
		int findJudge = s.findJudge(N, trust);
		
		System.out.println(findJudge);
	}

}
