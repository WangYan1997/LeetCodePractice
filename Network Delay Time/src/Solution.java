/**
 * 基本思路：
 * 把图中所有顶点分成两个集合S和V-S
	S：最短路径已确定的顶点集合
	V-S：尚未确定最短路径的顶点集合
  * 按最短路径长度递增的顺序逐个把V-S的顶点加到S中去，直至从s出发可以到达的所有顶点都包括进S中。
 * @author boxfo
 * @version 1.0
 * @date 2019年8月20日 下午4:42:44
 * @remarks TODO
 */
public class Solution {
	public final int MAX = 10000;

	public int networkDelayTime(int[][] times, int N, int K) {
		
		//因为题目中结点范围为[1,N],为便于表示和计算，在开始应用算法前将所有结点编号减一，使得结点范围变为[0,N)
		for(int i = 0; i < times.length; i++) {
			times[i][0]--;
			times[i][1]--;
		}
		K--;
		
		//boolean[] visit 表示结点是否在S中，结点编号对应索引值，visit[v] = true表示结点v在S中
		boolean[] visit = new boolean[N];
		//int[] len 表示S中的结点到V中对应结点的最短路径长度
		int[] len = new int[N]; 
		//将len初始化为结点K到V中各个结点的路径长度
		for (int i = 0; i < N; i++) {
			len[i] = Path(times, K, i);
		}
		//num用于记录S中结点数目，因为初始已有指定结点K在S中，所以num初始值为1
		int num = 1;
		//ans用于记录len中记录的 路径最短的结点(ans[0]) 和 最短路径长度(ans[1])
		int[] ans = new int[2];

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
			//当最短路径值也为MAX时，已无法遍历所有结点
			if(ans[1] == MAX) {
				return -1;
			}
		}
		return ans[1];
	}

	/**
	 * 每次从集合V中取出一个最短特殊路径长度最小的顶点u
	 * 修改权值(修改D中未求出的最短路径长度)：
	 * 由于引入u，对未求出最短路径的顶点i进行判断，若满足：
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
	 * 获得最短路径长度 及 其对应顶点
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
	 * 获得图中从点src到点des的直线距离
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
