import java.util.*;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        
        for(String email : emails) {
        	//parts = local name + domain name 
        	String[] parts = email.split("@");
        	String[] local = parts[0].split("\\+");
        	local[0] = local[0].replace(".", "");
        	normalized.add(local[0] + "@" + parts[1]);
        }
        
        return normalized.size();
    }
}
