/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019年8月11日 下午6:17:07
 * @remarks TODO
 * 斐波那契数列，使用矩阵计算，时间复杂度O(log n)
 */
public class Solution {
	public int fib(int N) {
		double f = ( Math.pow( (1 + Math.sqrt(5))/2 , N) - Math.pow( (1 - Math.sqrt(5))/2 , N)) / Math.sqrt(5);
		return (int) f;
	}
}
