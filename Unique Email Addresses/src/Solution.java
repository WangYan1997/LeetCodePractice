import java.util.*;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        
        for(String email : emails) {
        	StringBuffer local = new StringBuffer();
        	for(char ch : email.toCharArray()) {
        		if(ch == '+' || ch == '@') {
        			break;
        		}
        		if(ch == '.') {
        			continue;
        		}
        		local.append(ch);
        	}
        	
        	String address = local.toString() + email.substring(email.indexOf('@'));
        	normalized.add(address);
        }
        
        return normalized.size();
    }
}
