package Microsoft;

public class MinimumDeletionCost {
/*Given a string s and an array of integers cost where cost[i] is the cost of deleting the ith character in s.

Return the minimum cost of deletions such that there are no two identical letters next to each other.

Notice that you will delete the chosen characters at the same time, in other words, after deleting a character, the costs of deleting other characters will not change.

Input: s = "abaac", cost = [1,2,3,4,5]
Output: 3
Explanation: Delete the letter "a" with cost 3 to get "abac" (String without two identical letters next to each other).*/
	public static void main(String[] args) {

		String s = "aaabbbabbbb";
		int[] cost = {3,5,10,7,5,3,5,5,4,8,1};
		int ans=minCost(s, cost);
		System.out.println(ans);
	}
	
    public static int minCost(String s, int[] cost) {
        char[] ch=s.toCharArray();
        int min=0,result=0;
        for(int i=1;i<s.length();i++)
        {
        	if(ch[min]==ch[i])
        	{
        		result=result+Math.min(cost[i],cost[min]);
        		if(cost[min] < cost[i]) min = i;
        	}
        	else 
        		min = i;
        }
        
        return result;
    }

}
