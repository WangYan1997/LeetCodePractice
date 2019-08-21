
public class Main {
	public static void main(String[] args) { 
//		int num = 1994; //MCMXCIV
//		int num = 3333; //MMMCCCXXXIII
//		int num = 1880; //MDCCCLXXX
//		int num = 1800; //MDCCC
//		int num = 1500; //MD
//		int num = 1437; //MCDXXXVII
		int num = 3; // III

		
		Solution s = new Solution();
		String str = s.intToRoman(num);
		System.out.print(str);
	}

}
