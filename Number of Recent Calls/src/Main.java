
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecentCounter s = new RecentCounter();
		int[] t = {642,1849,4921,5936,5957};
//		int[] t = {1,100,3001,3002};
				
		for(int i = 0; i < t.length; i++) {
			int param_1 = s.ping(t[i]);
			System.out.println(param_1);
		}
		
	}

}
