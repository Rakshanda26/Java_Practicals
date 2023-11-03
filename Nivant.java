class Nivant
{
	protected String name;
	protected String schoolnm;
	protected String bestfriend;
	
	public void setdata(String nm,String snm,String bf)
	{
		name=nm;
		schoolnm=snm;
		bestfriend=bf;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("schoolnm is "+schoolnm);
		System.out.println("bestfriend is "+bestfriend);
	}
}
class EnggStudent extends Nivant
{
	private String collagenm;
	private String branch;
	private double percentage;
	private int academicgap;
	
	public void setdata(String nm,String snm,String bf,String clgnm,String br,double per,int agap)
	{
		super.setdata(nm,snm,bf);
		collagenm=clgnm;
		branch=br;
		percentage=per;
		academicgap=agap;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("collagenm is "+collagenm);
		System.out.println("branch is "+branch);
		System.out.println("percentage is "+percentage);
		System.out.println("academicgap is "+academicgap);
	}	
}
class Developer extends EnggStudent
{
	private int empid;
	private String cname;
	private int salary;
	private int allownces;
	private String joblocation;
	
	public void setdata(String nm,String snm,String bf,String clgnm,String br,double per,int agap,int ei,String cnm,int sal,int aw,String jl)
	{
		super.setdata(nm,snm,bf,clgnm,br,per,agap);
		empid=ei;
		cname=cnm;
		salary=sal;
		allownces=aw;
		joblocation=jl;
	}
	
	public void showdata()
	{
		super.showdata();
		System.out.println("empid is "+empid);
		System.out.println("cname is "+cname);
		System.out.println("salary is "+salary);
		System.out.println("allownces is "+allownces);
		System.out.println("joblocation is "+joblocation);
	}
}
class Dtest
{
	public static void main(String [] args)
	{
		Developer D1=new Developer();
		D1.setdata("Suraj","DBRK","Raksha","Kit","ETC",60.92,0,11,"TCS",50000,5000,"Pune");
		D1.showdata();
	}
}








