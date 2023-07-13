package day1;

public class DupString {

	public static void main(String[] args)
	{
		String s=new String("sayani");
		String s1=new String();
		for(int i=0; i<s.length(); i++)
		{
			for(int j=0; j<s1.length(); i++)
			{
				if(s.charAt(i)!=s1.charAt(j))
				{
					s1=s1+s.charAt(i);
				}
			}
		}
		System.out.println(s1);

	}

}
