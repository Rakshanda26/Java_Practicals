class Student
{
	String studentId;
	String studentName;
	int creditPoints;
	
	
	public Student(String snm,int cp)
	{
		studentName=snm;
		creditPoints=cp;
	}
	public boolean nameValidation(String studentName)
	{
		if(studentName==null){
			return false;
		}
		else{
			return studentName.matches("^[A-Za-z]{4,}$");
		}
	}
}
class Test
{
	public static void main(String [] args)
	{
		Student S1=new Student("Rakshanda",100);
		S1.nameValidation("Rakshanda");
	}
}