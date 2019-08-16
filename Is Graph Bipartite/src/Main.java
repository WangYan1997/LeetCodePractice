
public class Main {
	public static void main(String[] args) {
//		int[][] graph = {{1,3}, {0,2}, {1,3}, {0,2}};
		int[][] graph = {{1,2,3}, {0,2}, {0,1,3}, {0,2}};
		
		Solution s = new Solution();
		boolean isBipartite = s.isBipartite(graph);
		System.out.print(isBipartite);
	}
}
