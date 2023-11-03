import javax.swing.*;
class Person
{
	public String name;
	public String city;
	
	public void setdata()
	{
		name=JOptionPane.showInputDialog("Enter the name");
		city=JOptionPane.showInputDialog("Enter the city");
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
	}
}
class Customer extends Person
{
	private String pname;
	private int price;
	private int qty;
	
	public void setdata()
	{  
		super.setdata();
		pname=JOptionPane.showInputDialog("Enter the product name "+pname);
		String p=JOptionPane.showInputDialog("Enter the price");
			price=Integer.parseInt(p);
		String q=JOptionPane.showInputDialog("Enter the qty");
			qty=Integer.parseInt(q);
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("product name is "+pname);
		System.out.println("price is "+price);
		System.out.println("qty is "+qty);
		
	}
	public void Bill()
	{
		int bill=price*qty;
		System.out.println("Bill is "+bill);
	}
}
class Htest
{
	public static void main(String[]args)
	{
		Customer C1=new Customer();
		C1.setdata();
		C1.showdata();
		C1.Bill();
	
	}
}
