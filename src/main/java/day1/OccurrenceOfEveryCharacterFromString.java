package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccurrenceOfEveryCharacterFromString {

	public static void main(String[] args) {
		String str="automation";
		char str_arr[]=str.toCharArray();
		int l=str_arr.length;
		
		Map<Character, Integer> m=new HashMap<>();
		
		for(int i=0; i<l; i++)
		{
			int count=0;
			for(int j=0; j<l; j++)
			{
				if(str_arr[i]==str_arr[j])
				{
					count++;
					
				}
				
			}
			m.put(str_arr[i], count);
		}
		System.out.println(m);
		

	}

}
