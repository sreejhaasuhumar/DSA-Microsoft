package Microsoft;

public class ZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int[] ans=sumZero(n);
		System.out.println(ans);
	}
	
	 public static int[] sumZero(int n) {
	        int[] res = new int[n];
	        int left = 0, right = n - 1, start = 1;
	        while (left < right) {
	            res[left++] = start;
	            res[right--] = -start;
	            start++;
	        }
	        return res;
	    
	    }

}
