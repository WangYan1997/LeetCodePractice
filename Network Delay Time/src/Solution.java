
public class Solution {
	public final int MAX = 10000;

	public int networkDelayTime(int[][] times, int N, int K) {
		
		for(int i = 0; i < times.length; i++) {
			times[i][0]--;
			times[i][1]--;
		}
		K--;
		
		
		boolean[] visit = new boolean[N]; //visit中记录每个点是在集合S还是在集合V中
		int[] len = new int[N]; // the len between v and w
		int num = 1;
		int[] ans = new int[2];
		for (int i = 0; i < N; i++) {
			len[i] = Path(times, K, i);
		}
		
		//把点K加入集合S
		visit[K] = true;

		//每次从集合V-S中取出一个最短特殊路径长度最小的顶点u		
		int u = K;
		while (num != N) {
			ans = Visit(times, N, visit, u, len);
			if (ans[0] != -1 && ans[1] != -1) {
				visit[ans[0]] = true;
				u = ans[0];
				num++;
			}	
			if(ans[0] == -1) {
				return -1;
			}
		}
		
		//此时visit中所有元素的值都为true
		if(ans[1] == MAX) {
			return -1;
		}else {
			return ans[1];
		}
		
	}

	/**
	 * 每次从集合V-S中取出一个最短特殊路径长度最小的顶点u
	 * 修改权值(修改D中未求出的最短路径长度)：由于引入u，对未求出最短路径的顶点i进行判断，若满足：
	 * D[i] > D[u]+W[ u, i ] 则改为最短，令D[i] = D[u]+W[ u, i ]
	 * ans[]中，ans[0]中记录结点名称，ans[1]记录最短路径
	 * @param times
	 * @param N
	 * @return
	 */
	public int[] Visit(int[][] times, int N, boolean[] visit, int u, int[] len) {
		for(int i = 0; i < N; i++) {
			//只考虑点u到集合V中各个点的距离是否需要更新
			if(visit[i] != true) {
				if(len[i] > len[u] + Path(times, u, i)) {
					len[i] = len[u] + Path(times, u, i);
				}
			}
		}
		
		return min(len, visit, N);
	}
	
	/**
	 * 获得len中最小的那个值和其对应的顶点
	 * @param len
	 * @param visit
	 * @param N
	 * @return
	 */
	public int[] min(int[] len, boolean[] visit, int N) {
		int[] ans = new int[2];
		
		int Min = MAX;
		
		for(int i = 0; i < N; i++) {
			if(len[i] != -1 && len[i] <= Min && visit[i] == false) {
				Min = len[i];
				ans[0] = i;
				ans[1] = len[i];
			}
		}
		
		return ans;
	}

	/**
	 * 获得用times表示的图中，从点src到点des的支线距离
	 * @param times
	 * @param src
	 * @param des
	 * @return
	 */
	public int Path(int[][] times, int src, int des) {
		if(src == des) {
			return 0;
		}
		
		for (int[] p : times) {
			if (p[0] == src  && p[1] == des) {
				return p[2];
			}
		}

		return MAX;
	}
}
