package oops;

public class ContructorOverloading {
	int x;
	int y;
	double d;

	ContructorOverloading()// 1
	{
		int x = 100;
		int y = 200;
		

	}

	ContructorOverloading(int a, int b)// 2
	{
		int x = a;
		int y = b;

	}

	ContructorOverloading(int a, double b)// 3
	{
		int x = a;
		double d = b;

	}

	ContructorOverloading(double b, int a)// 4
	{

		int x = a;
		double d = b;

	}

	void display() 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}

	public static void main(String[] args) {
		ContructorOverloading co = new ContructorOverloading(100, 200);
		co.display();
	}

}
