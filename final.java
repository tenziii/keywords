final class A
{
	int x=10;
	void display()
	{
		System.out.println(x);
	}
}
class B extends A{
	int y=90;
	void display()
	{
		System.out.println(y);
	}
	public static void main(String args[])
	{
		B b = new B();
	}
}