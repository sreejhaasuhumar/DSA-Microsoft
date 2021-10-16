package Microsoft;

import java.util.Arrays;
import java.util.Collections;

public class MinStepsToMakePilesEqualHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] piles= {1,2,3,4};
		int ans=countSteps(piles);
		System.out.println(ans);
	}
	
	public static int countSteps(Integer[] a) {	

		int stepsCount=0;
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]>a[i])
			{
				stepsCount=stepsCount+i;
			}
		}
		
		return stepsCount;
	}
}
