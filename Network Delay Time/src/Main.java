//times = [[2,1,1],[2,3,1],[3,4,1]], N = 4, K = 2
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
		int N = 4;
		int K = 2;
		
		
//		int[][] times = {{0,1,10}, {0,3,30}, {0,4,100}, {1,2,50}, {2,4,10}, {3,1,10}, {3,2,20}, {3,4,60}};
//		int N = 5;
//		int K = 0;
		
		Solution s = new Solution();
		int time = s.networkDelayTime(times, N, K);
		System.out.print(time);
	}

}
