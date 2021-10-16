package Microsoft;

public class PoliceThief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch= {'t','p','p','t','p','t','p'};
		int k=2;
		int ans= findThief(ch,k);
	}
	
	static int count=0;
	public static int findThief(char ch[],int k) {
		
		int memo[] =new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='t')
				memo[i]=0;
			else
				memo[i]=1;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='p')
			{
			for(int j=1;j<=k;j++)
			{
				if(i+j>=0 && i-j>=0 && i+j<ch.length && i-j<ch.length)
					if( memo[i+j]==0 )
				    {
					count++;
					memo[i+j]=1;
					break;
				    }
					else if(memo[i-j]==0)
					{
						count++;
						memo[i-j]=1;
						break;	
					}

			}
			}
		}
		
		return count;
		
	}

}
