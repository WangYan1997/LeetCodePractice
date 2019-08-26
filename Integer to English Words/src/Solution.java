import java.util.*;

public class Solution {
	private String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	private String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	private String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

	public String numberToWords(int num) {
		if (num == 0) {
			return "Zero";
		}

		String str = new String();

		for (int i = 3; i >= 0; i--) {
			str = str + helper(num / (int) Math.pow(1000, i));

			if (num / (int) Math.pow(1000, i) > 0) {
				str = str + " " + THOUSANDS[i] + " ";
			}

			num = num % (int) Math.pow(1000, i);
		}

		return str.trim();
	}

	private String helper(int num) {
		String str = new String();

		if (num >= 1000 || num == 0) {
			return "";
		}

		if (num > 0 && num < 20) {
			str = LESS_THAN_20[num];
		} else if (num >= 20 && num < 100) {
			str = TENS[num / 10] + " " + helper(num % 10);
		} else if (num >= 100) {
			str = LESS_THAN_20[num / 100] + " " + "Hundred" + " " + helper(num % 100);
		}

		return str.trim();
	}

}
