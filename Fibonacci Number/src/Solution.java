/**
 * 
 * @author boxfo
 * @version 1.0
 * @date 2019��8��11�� ����6:17:07
 * @remarks TODO
 * 쳲��������У�ʹ�ù�ʽ����
 */
public class Solution {
	public int fib(int N) {
		double f = ( Math.pow( (1 + Math.sqrt(5))/2 , N) - Math.pow( (1 - Math.sqrt(5))/2 , N)) / Math.sqrt(5);
		return (int) f;
	}
}
