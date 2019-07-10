import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] input = {"bella", "label", "roller"};
		
		String[] input = {"cool", "lock", "cook"};
		Solution s = new Solution();
		List<String> str = new ArrayList<>();
		
		str = s.commonChars(input);
		System.out.println(str);
	}

}
