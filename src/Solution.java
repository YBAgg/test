import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String []str = s.split("");
        int start=0;
        int end=0;
        int length = 0;
        while(end!=str.length-1) {
        	ArrayList<String> comp = new ArrayList<String>();
        	comp.add(str[start]);
        	for(int i = start+1;i<str.length;i++) {
        		boolean flag = false;
        		for(int j = 0;j<comp.size();j++) {
        			if(comp.get(j).equals(str[i])) {
        				start = i;
        				if(length<comp.size()) {
        					length = comp.size();        					
        				}
        				flag = true;
        				break;
        				
        			}
        			else {
        				end = i;
        				comp.add(str[i]);
        				length=comp.size();
        			}
        		}
        		
        		if(flag == true) {
        			break;
        		}
        	}
        }
        return length;
    }
}