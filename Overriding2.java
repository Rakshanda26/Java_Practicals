class Baseclass
{
	public void method1()
	{
		System.out.println("Hi,I am base class");
	}
}
class Child extends Baseclass
{
	public void method1()
	{
		System.out.println("Hi,I am child class ");

	}
}
class Ptest
{
	public static void main(String [] args)
	{
		Baseclass B1=new Baseclass();
		B1.method1();
		Baseclass C1=new Child();
		C1.method1();
	}
}