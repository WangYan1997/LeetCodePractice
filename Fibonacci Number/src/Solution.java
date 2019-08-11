/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019年8月11日 下午6:17:07
 * @remarks TODO
 * 斐波那契数列，使用临时变量存储F(n-1)和F(n-2)，时间复杂度为 O(n)
 */
public class Solution {
	public int fib(int N) {
		int f = N;
		
		if(N <= 1) {
			return f;
		}
		
		int iter1 = 0;
		int iter2 = 1;
		
		for(int i = 2; i <= N; i++) {
			f = iter1 + iter2;
			iter1 = iter2;
			iter2 = f;
		}
		return f;
	}
}
