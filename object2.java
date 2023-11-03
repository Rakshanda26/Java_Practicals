class Emp
{
private int empid;
private String name;
private int wages;
private int wdays;
public void setdata(int ei,String nm,int wg,int wd)
{
	empid=ei;
	name=nm;
	wages=wg;
	wdays=wd;
}
public void showdata()
{
System.out.println("empid is"+empid);
System.out.println("empid is"+name);
System.out.println("empid is"+wages);
System.out.println("empid is"+wdays);
}
public void payment()
{
int pay=wages*wdays;
System.out.println("paymentis"+pay);
}
}
class Etest
{
public static void main(String[]args)
{
	Emp E1;
	E1=new Emp();
	E1.setdata(1001,"kunal",2000,20);
	E1.showdata();
	E1.payment();
	
	
	Emp E2;
	E2=new Emp();
	E2.setdata(1002,"nital",2200,22);
	E2.showdata();
	E2.payment();
	
}
}