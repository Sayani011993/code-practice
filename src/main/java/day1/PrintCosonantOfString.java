package day1;

public class PrintCosonantOfString {
	public static void main(String[] args) {
		String str="I like Automation";
		String vowels="AaEeIiOoUu";
		String output=" ";
		int count=0;
		for(char c:str.toCharArray())
		{
			if(vowels.indexOf(c)==-1)
			{
				output=output + c;
			}
			else
			{
				count++;
			}
		}
		System.out.println(output);
		System.out.println("No of vowels are present in string are:"+ count);
	}
}
