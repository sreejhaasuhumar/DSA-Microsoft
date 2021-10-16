package Microsoft;

public class BiggestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaAbbB";
		String a=getBiggestString(s);
		System.out.println(a);

	}
	
	public static String getBiggestString(String a) {
		int[] arr=new int[52];
		for(char c:a.toCharArray())
		{
			arr[c-'A']++;
		}
		String result=null;
		
		for(int i=51;i>=0;i--)
		{
			if(arr[i]>0 && arr[i+1/2]>0)
			{
				result=(char)(i+1/2+'A')+"";
				break;
			}
		}
		
		return result.toUpperCase();
	}

}
