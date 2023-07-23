package oops;

public class MethodOverloading {

	int x;
	int y;
	double d;

	void add()// 1
	{
		int x = 10;
		int y = 20;
		System.out.println(x + y);
	}

	void add(int a, int b)// 2
	{
		int x = a;
		int y = b;
		System.out.println(x + y);
	}

	void add(int a, double b)// 3
	{
		int x = a;
		double d = b;
		System.out.println(x + b);
	}

	void add(double b, int a)// 4
	{

		int x = a;
		double d = b;
		System.out.println(x + b);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add();// 1
		m.add(100, 200);// 2
		m.add(10, 10.5);// 3
		m.add(20.5, 10);// 4
	}
}
