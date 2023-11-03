import javax.swing.*;
class Result
{
public static void main(String[]args)
{
	int p=90, c=88,m=72,b=92,e=82;
	if(p>=40&&c>=40&&m>=40&&b>=40&&e>=40)
	{
	int total=p+c+m+b+e;
	double per=total/5;
	System.out.print(" student is pass");
	if(per>=60)
	{
	System.out.print("with first class");
	}
	}
	else
	{
	System.out.println("student is fail");
	}
}
}