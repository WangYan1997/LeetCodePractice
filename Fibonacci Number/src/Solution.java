/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019��8��11�� ����6:17:07
 * @remarks TODO
 * 쳲��������У�ʹ�õݹ�ķ�ʽʵ�֣�ʱ�临�Ӷ�Ϊ O(2^n)
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
