/**
 * ����ͼGΪ����ͼ�ĳ�ֱ�Ҫ�����ǣ�G��������������,�������л�·�ĳ��Ⱦ�Ϊż����
 * �ж��Ƿ�Ϊ����ͼ���ֳ�Ϊ˫ɫ����
 * @author boxfo
 * @version 1.0
 * @date 2019��8��16�� ����3:02:57
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
