package Microsoft;

import java.util.LinkedList;
import java.util.Queue;

import test.TreeNode;

public class SumOfLeafNodesAtMinLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left =new TreeNode(2);
		root.right =new TreeNode(3);
		root.right.left=new TreeNode(5);
		root.left.right=new TreeNode(4);
		int ans=sumOfLeafNodesAtMinLevel(root);
		System.out.println(ans);
	}

	public static int sumOfLeafNodesAtMinLevel(TreeNode root)
	{
		int sum=0;
		if(root == null)
			 return 0;
		if(root.left == null && root.right==null)
			return root.val;
		
		Queue q=new LinkedList<>();
		q.add(root);
		boolean f = false;
		while (f == false)
	    {
		int a=q.size();
		while(a-->0)
		{
			TreeNode top=(TreeNode) q.peek();
			q.remove();
			if(top.left == null && top.right ==null)
			{
				sum = sum + top.val; 
				f= true;
			}
			else
			{
				if(top.left !=null)
					q.add(top.left);
				if(top.right!=null)
					q.add(top.right);
			}
		}
	    }
		return sum;
	}
}
