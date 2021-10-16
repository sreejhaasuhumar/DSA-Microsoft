package Microsoft;

import java.util.ArrayList;
import java.util.List;

public class SimilarFeatureCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"100","110","010","011","100"};
		List<Integer> ans =findSimilar(s);
		System.out.println(ans);
	}
	
	public static List<Integer> findSimilar(String[] s) {
		
		int count=0;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<s.length;i++)
		{
			count=0;
			Integer a=Integer.parseInt(s[i],2);	

			for(int j=0;j<s.length;j++)
			{
				if(i!=j) {
				Integer b=Integer.parseInt(s[j],2);
			
			if((Integer.bitCount(a^b))<=1)
			{
			   	count++;
			}
				}
			}
			list.add(count);
				
		}
		
		return list;
		
	}

}
