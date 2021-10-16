package Microsoft;

public class MinAdditions {
	/*given a string s , find the number of additional letters to add to make the groups uniform
	S="babaa"
	here b,a,b,aa are the groups
	to make uniform
	bb,aa,bb,aa , we need to add 3 extra alphabets
	so ans is 3*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="babaa";
		int a= solution(s);
		System.out.println(a);
		
	}
	
	 public static int solution(String str) {
	        int maxBlock = 1;
	        int totalCharacters = str.length();
	        int groups = 1;
	        int count = 1;
	        for(int curr = 0; curr < totalCharacters; curr++) {
	            if(curr > 0) {
	                if(str.charAt(curr) != str.charAt(curr - 1)) {
	                    groups++;
	                    count = 1;
	                } else {
	                    count++;   
	                }
	                maxBlock = Math.max(count, maxBlock);
	            }
	        }
	        long totalRequiredLength = (groups * maxBlock) - maxBlock;
	        return (int) (totalRequiredLength - (totalCharacters - maxBlock));
	    }

}
