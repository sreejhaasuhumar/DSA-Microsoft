package Microsoft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*A string s is called good if there are no two different characters in s that have the same frequency.

Given a string s, return the minimum number of characters you need to delete to make s good.

The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
*/
public class MinimumDeletionsToMakeCharacterFrequenciesUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aab";
		int ans=minDeletions2(s);
		System.out.println(ans);
	}
	
	/* public static int minDeletions(String s) {
		 char[] a=s.toCharArray();
		 int max=0;
		 int delCount=0;
		 Map<Character,Integer> map=new HashMap<>();
	        HashSet<Integer> set = new HashSet<>();

		 for(int i=0;i<s.length();i++)
		 {
			 int b=map.getOrDefault(a[i],0)+1;
			 map.put(a[i],b);
			 max=Math.max(max,b);
		 }
	
	for(int i=0;i<map.size();i++)
	{
			 if(!set.contains(max))
			 {
				 set.add(max);
			 }
			 else max--;
		 }

		 return delCount;
	  }*/
	 
	 public static int minDeletions2(String s)
	    {
	        HashMap<Character, Integer> map = new HashMap<>();
	        HashSet<Integer> set = new HashSet<>();
	        
	        int count = 0;
	        for(char c : s.toCharArray())
	            map.put(c, map.getOrDefault(c, 0)+1);
	        
	        for(char c: map.keySet())
	        {
	            int num = map.get(c);
	            if(!set.contains(map.get(c)))
					set.add(num);
	            else
	            {
	                while(num > 0 && set.contains(num))
	                {
	                    count++;
	                    num --;
	                }
	                set.add(num);
	            }
	        }
	        
	        return count;
	    }
}
