/**
 * 无向图G为二分图的充分必要条件是，G至少有两个顶点,且其所有回路的长度均为偶数。
 * 判断是否为二分图，又称为双色问题
 * @author boxfo
 * @version 1.0
 * @date 2019年8月16日 下午3:02:57
 * @remarks TODO
 */
public class Solution {
	private boolean[] marked;
	private boolean[] color;
	private boolean isTwoColorable = true;

	public boolean isBipartite(int[][] graph) {
		marked = new boolean[graph.length];
		color = new boolean[graph.length];

		for (int s = 0; s < graph.length; s++) {
			if (!marked[s])
				dfs(graph, s);
		}

		return isTwoColorable;

	}

	public void dfs(int[][] graph, int v) {
		marked[v] = true;
		for (int w : graph[v]) {
			if (!marked[w]) {
				color[w] = !color[v];
				dfs(graph, w);
			} else if (color[w] == color[v]) {
				isTwoColorable = false;
				return;
			}
		}
	}
}
