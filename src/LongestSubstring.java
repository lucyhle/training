import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	public static int getValue (char c) {
		int temp = (int)c;
    	int lower_diff = 96;
    	int upper_diff =  64;

    	if(temp<=122 & temp>=97){
    		return temp-lower_diff;
    	}
    	else 
    		return temp - upper_diff;
	}
    public static int lengthOfLongestSubstring(String s) {
    	if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("dabhyasg"));
		System.out.println(lengthOfLongestSubstring("cdcegct"));
	}

}
