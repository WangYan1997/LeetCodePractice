/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019��8��11�� ����6:17:07
 * @remarks TODO
 * 쳲��������У�ʹ����ʱ�����洢F(n-1)��F(n-2)��ʱ�临�Ӷ�Ϊ O(n)
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
