package day1;

public class StarPattern1 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++)
		{
			char c1='A';
			for(int j=4; j>=i; j--)
			{
				System.out.print(c1 + " ");
				c1++;
				
			}
			System.out.println();
			
			
		}
	}
}
