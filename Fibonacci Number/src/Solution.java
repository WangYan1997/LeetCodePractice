/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019年8月11日 下午6:17:07
 * @remarks TODO
 * 斐波那契数列，使用递归的方式实现，时间复杂度为 O(2^n)
 */
public class Solution {
	public int fib(int N) {
		
		if(N <= 1) {
			return N;
		}
		
		int f = fib(N - 1) + fib(N - 2);
		
		return f;
	}
}
