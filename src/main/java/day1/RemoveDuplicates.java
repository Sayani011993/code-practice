package day1;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String arr[]= {"s", "a", "y", "a", "n", "i"};
		HashSet<String> hs=new HashSet<>();
		boolean flag=false;
		for(String l:arr)
		{
			if(hs.add(l)==false)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
			if(flag==false)
			{
				System.out.println(l);
			}
		}
	}
}
