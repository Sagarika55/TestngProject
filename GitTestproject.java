
public class GitTestproject {

	public static void main(String[] args) {
	
		String s= "sdfds";
		char [] a =s.toCharArray();
		String rev ="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev= rev+a[i];
		}
		
		System.out.println(rev);
	}

}
