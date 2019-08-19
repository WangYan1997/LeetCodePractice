
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a0 = new String("test.email+alex@leetcode.com");
		String a1 = new String("test.e.mail+bob.cathy@leetcode.com");
		String a2 = new String("testemail+david@lee.tcode.com");
		
		String[] emails = new String[3];
		emails[0] = a0;
		emails[1] = a1;
		emails[2] = a2;
		
		Solution s = new Solution();
		int count = s.numUniqueEmails(emails);
		System.out.print(count);
	}

}
