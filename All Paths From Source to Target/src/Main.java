import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] graph = {{1,2}, {3}, {3}, {}};
		int[][] graph = {{1,2}, {3}, {3,4}, {4}, {}};
		List<List<Integer>> paths;
		
		Solution s = new Solution();
		
		paths = s.allPathsSourceTarget(graph);
		System.out.println(paths);
		
	}

}
