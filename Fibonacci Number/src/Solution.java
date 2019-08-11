/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019年8月11日 下午6:17:07
 * @remarks TODO
 * 斐波那契数列，使用数组存储F(N - 1)和F(N - 2)，时间复杂度为 O(n)
 */
public class Solution {
	public int fib(int N) {
		
		if(N <= 1) {
			return N;
		}
		
		int[] f = new int[N + 1];
		
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		
		return f[N];
		
	}
}
