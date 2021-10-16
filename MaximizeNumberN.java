package Microsoft;

public class MaximizeNumberN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1234, K = 6;
		int ans=maximize(N,K);
		System.out.println(ans);
	}
	
	public static int maximize(int n,int k) {
		
		String s=String.valueOf(n);
		
		StringBuilder a=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			int j=Character.getNumericValue(s.charAt(i));
			if(j<k)
			{
				a.append(s.substring(0,i));
				a.append(k);
				a.append(s.substring(i));
				break;
			}
		}
		return Integer.parseInt(a.toString());
		
	}

}
