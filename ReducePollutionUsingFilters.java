package Microsoft;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReducePollutionUsingFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5, 19, 8, 1};
		int ans=findFilters(A);
		System.out.println(ans);
	}
	
	public static int findFilters(int[] a) {
		Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
		int origSum=0;
		int filterCount=0;
		for(int i:a)
		{
			origSum=origSum+i;
			q.offer(i);
		}
		
		int sum=origSum;
		while(!q.isEmpty())
		{
			for(int i=0;i<q.size();i++)
			{
				int element =q.poll();

				if(sum-element+(element/2)>=origSum/2)
				{
					q.offer(element/2);
					filterCount++;
					sum=sum-element+(element/2);
				}
				else
				{
				  q.clear();
				}
				
			}
		}
		
		return filterCount+1;
		
	}
	
	

}
