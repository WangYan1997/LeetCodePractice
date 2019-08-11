/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019��8��11�� ����6:17:07
 * @remarks TODO
 * 쳲��������У�ʹ������洢F(N - 1)��F(N - 2)��ʱ�临�Ӷ�Ϊ O(n)
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
