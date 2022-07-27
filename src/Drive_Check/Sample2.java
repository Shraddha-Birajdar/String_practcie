package Drive_Check;

public class Sample2 {

	public static void main(String args[])
	{
		String s1="Shraddha";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			 rev = rev+s1.charAt(i);
			// System.out.println(s1);
			
		}
		 System.out.println(rev);
	}
}
