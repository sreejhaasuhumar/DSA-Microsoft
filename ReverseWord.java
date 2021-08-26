package Microsoft;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  Bob    Loves  Alice   ";
		String rev=reverseWords(s);
		System.out.println(rev);

	}
	
    public static String reverseWords(String s) {
    	String[] arr=null;
    	s.trim();
    	arr=s.split(" ");
    	String s1 = "";
    	
    	for(int i=arr.length-1;i>=0;i--)
    	{
    		if(arr[i]!="")
    		s1=s1+" "+arr[i];
    	}
   	
    	return s1.trim();
    	
    }

}
