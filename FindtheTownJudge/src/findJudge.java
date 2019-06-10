class Solution {
	public static final int indegree = 0;
	public static final int outdegree = 1;
	public static final int start = 0;
	public static final int end = 1;

	public int findJudge(int N, int[][] trust) {
	
		int judge = -1;
		int[][] vertex = new int[N][2];
		int l = trust.length;

		for (int i = 0; i < l; i++) {
			vertex[trust[i][start] - 1][outdegree]++;
			vertex[trust[i][end] - 1][indegree]++;
		}

		for (int i = 0; i < N; i++) {
			if (vertex[i][indegree] == N - 1 && vertex[i][outdegree] == 0) {
				judge = i + 1;
				break;
			}
		}

		return judge;
	}

}
