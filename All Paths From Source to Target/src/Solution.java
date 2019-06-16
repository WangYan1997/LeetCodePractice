import java.util.*;

class Solution {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> paths = new ArrayList();

		int start = 0;
		ArrayList<Integer> path = new ArrayList<>();
		paths = find(graph, start, path, paths);

		return paths;
	}

	private List<List<Integer>> find(int[][] graph, int start, List<Integer> path, List<List<Integer>> paths) {
		
		path.add(start);
		int N = graph.length;
		if (start == N - 1) {
			List<Integer> temppath = new ArrayList(path);
			paths.add(temppath);
			if (path.size() > 0) {
				path.remove(path.size() - 1);
			}
			return paths;
		} else {
			for (int i = 0; i < graph[start].length; i++) {
				int end = graph[start][i];
				paths = find(graph, end, path, paths);
			}
			if (path.size() > 0) {
				path.remove(path.size() - 1);
			}
		}

		return paths;
	}
}
