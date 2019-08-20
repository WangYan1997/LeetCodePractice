
public class Solution {
	public final int MAX = 10000;

	public int networkDelayTime(int[][] times, int N, int K) {
		
		for(int i = 0; i < times.length; i++) {
			times[i][0]--;
			times[i][1]--;
		}
		K--;
		
		
		boolean[] visit = new boolean[N]; //visit�м�¼ÿ�������ڼ���S�����ڼ���V��
		int[] len = new int[N]; // the len between v and w
		int num = 1;
		int[] ans = new int[2];
		for (int i = 0; i < N; i++) {
			len[i] = Path(times, K, i);
		}
		
		//�ѵ�K���뼯��S
		visit[K] = true;

		//ÿ�δӼ���V-S��ȡ��һ���������·��������С�Ķ���u		
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
		
		//��ʱvisit������Ԫ�ص�ֵ��Ϊtrue
		if(ans[1] == MAX) {
			return -1;
		}else {
			return ans[1];
		}
		
	}

	/**
	 * ÿ�δӼ���V-S��ȡ��һ���������·��������С�Ķ���u
	 * �޸�Ȩֵ(�޸�D��δ��������·������)����������u����δ������·���Ķ���i�����жϣ������㣺
	 * D[i] > D[u]+W[ u, i ] ���Ϊ��̣���D[i] = D[u]+W[ u, i ]
	 * ans[]�У�ans[0]�м�¼������ƣ�ans[1]��¼���·��
	 * @param times
	 * @param N
	 * @return
	 */
	public int[] Visit(int[][] times, int N, boolean[] visit, int u, int[] len) {
		for(int i = 0; i < N; i++) {
			//ֻ���ǵ�u������V�и�����ľ����Ƿ���Ҫ����
			if(visit[i] != true) {
				if(len[i] > len[u] + Path(times, u, i)) {
					len[i] = len[u] + Path(times, u, i);
				}
			}
		}
		
		return min(len, visit, N);
	}
	
	/**
	 * ���len����С���Ǹ�ֵ�����Ӧ�Ķ���
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
	 * �����times��ʾ��ͼ�У��ӵ�src����des��֧�߾���
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
