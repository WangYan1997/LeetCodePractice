import java.util.*;

class Solution {
	public List<String> commonChars(String[] A) {
        List<String> str = new ArrayList<>();
        int num = A.length; 
        int[][] map = new int[num][26];
        
        for(int i = 0; i < num; i++) {
        	int length = A[i].length();
        	for(int j = 0; j < length; j++) {
        		map[i][ A[i].charAt(j) - 'a' ]++;
        	}
        }
        
        for(int j = 0; j < 26; j++) {
        	int min = 101;
        	for(int i = 0; i < num; i++) {
        		if(map[i][j] == 0) {
        			min = -1;
        			break;
        		}else {
        			//get the min frequency of the character
        			if(map[i][j] < min) {
        				min = map[i][j];
        			}
        		}
        	}
        	for(int k = 0; k < min; k++) {
        		char temp = (char)(j + 'a');
        		str.add(String.valueOf(temp));
        	}
        }
        
        return str;
    }
}
