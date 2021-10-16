package Microsoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxLengthConcatenatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("un");
		list.add("iq");
		list.add("ue");
		int ans=maxLength(list);
		
	}

	 private static int result = 0;

	    public static int maxLength(List<String> arr) {
	        if (arr == null || arr.size() == 0) {
	            return 0;
	        }

	        dfs(arr, "", 0);

	        return result;
	    }

	    private static void dfs(List<String> arr, String path, int idx) {
	        boolean isUniqueChar = isUniqueChars(path);
	        
	        if (isUniqueChar) {
	            result = Math.max(path.length(), result);
	        }

	        if (idx == arr.size() || !isUniqueChar) {
	            return;
	        }
	        
	        for (int i = idx; i < arr.size(); i++) {
	            dfs(arr, path + arr.get(i), i + 1);
	        }
	    }

	    private static boolean isUniqueChars(String s) {
	        Set<Character> set = new HashSet<>();

	        for (char c : s.toCharArray()) {
	            if (set.contains(c)) {
	                return false;
	            }
	            set.add(c);
	        }
	        return true;
	    }
}
