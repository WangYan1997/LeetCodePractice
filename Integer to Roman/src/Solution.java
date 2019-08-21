
public class Solution {
	public String intToRoman(int num) {
		StringBuffer str = new StringBuffer();
		//千位
		for (int i = 0; i < num / 1000; i++) {
			str.append("M");
		}
		
		//百位
		num = num % 1000;
		int hundred = num / 100;

		if (hundred > 0 && hundred < 4) {
			for(int i = 0; i < hundred; i++) {
				str.append("C");
			}
		}
		
		if(hundred > 5 && hundred < 9) {
			str.append("D");
			for(int i = 0; i < Math.abs(hundred - 5); i++) {
				str.append("C");
			}
		}
		
		switch(hundred) {
		case 4:
			str.append("CD");
			break;
		case 5:
			str.append("D");
			break;
		case 9:
			str.append("CM");
			break;
		}
		
		//十位
		num = num % 100;
		int ten = num / 10;
		
		if (ten > 0 && ten < 4 ) {
			for(int i = 0; i < ten; i++) {
				str.append("X");
			}
		}
		
		if(ten > 5 && ten < 9) {
			str.append("L");
			for(int i = 0; i < Math.abs(ten - 5); i++) {
				str.append("X");
			}
		}
		
		switch(ten) {
		case 4:
			str.append("XL");
			break;
		case 5:
			str.append("L");
			break;
		case 9:
			str.append("XC");
			break;
		}
		
		//个位
		num = num % 10;
		int one = num;
		if (one > 0 && one < 4) {
			for(int i = 0; i < one; i++) {
				str.append("I");
			}
		}
		
		if(one > 5 && one < 9) {
			str.append("V");
			for(int i = 0; i < Math.abs(one - 5); i++) {
				str.append("I");
			}
		}
		
		switch(one) {
		case 4:
			str.append("IV");
			break;
		case 5:
			str.append("V");
			break;
		case 9:
			str.append("IX");
			break;
		}
		

		return str.toString();
	}
}
