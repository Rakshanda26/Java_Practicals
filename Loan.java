class Loan
{
	private String Firstname;
	private String Middlename;
	private String Lastname;
	private String Address;
	private int Pancardno;
	private int Aadharno;
	private String ReturnDetails;
	private String Incomeproof;
	private int Dateofbirth;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob)
	{
		Firstname=Fnm;
		Middlename=Mnm;
		Lastname=Lnm;
		Address=Add;
		Pancardno=Pan;
		Aadharno=Adh;
		ReturnDetails=RD;
		Incomeproof=Ip;
		Dateofbirth=Dob;
	}
	public void showdata()
	{
		System.out.println("Firstname is "+Firstname);
		System.out.println("Middlename is "+Middlename);
		System.out.println("Lastname is "+Lastname);
		System.out.println("Address is "+Address);
		System.out.println("Pancardno is "+Pancardno);
		System.out.println("Aadharno is "+Aadharno);
		System.out.println("ReturnDetails is "+ReturnDetails);
		System.out.println("Incomeproof is "+Incomeproof);
		System.out.println("Dateofbirth is "+Dateofbirth);
	}
}
class Homeloan extends Loan
{
	private String Addressofproof;
	private String Typeofproperty;
	private int Carpetrarea;
	private int Builtuparea;
	private String Ownertype;
	private String Sellername;
	private String Sellerdetails;
	private int Costofproperty;
	private int Loanammount;
	private double Rateofinterest;
	private double Duration;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,String Addp,String Tproperty,int CArea,int BArea,String Owtype,String Snm,String SD,int Cop,int Lamt,double roi,double dur)
	{
		super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
		Addressofproof=Addp;
		Typeofproperty=Tproperty;
		Carpetrarea=CArea;
		Builtuparea=BArea;
		Ownertype=Owtype;
		Sellername=Snm;
		Sellerdetails=SD;
		Costofproperty=Cop;
		Loanammount=Lamt;
		Rateofinterest=roi;
		Duration=dur;	
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Addressofproof is "+Addressofproof );
		System.out.println("Typeofproperty is "+Typeofproperty);
		System.out.println("Carpetrarea is "+Carpetrarea);
		System.out.println("Builtuparea is "+Builtuparea);
		System.out.println("Ownertype is "+Ownertype);
		System.out.println("Sellername is "+Sellername);
		System.out.println("Sellerdetails is "+Sellerdetails);
		System.out.println("Costofproperty is "+Costofproperty);
		System.out.println("Loanammount is "+Loanammount);
		System.out.println("Rateofinterest is "+Rateofinterest);
		System.out.println("Duration is "+Duration);
	}
	
	public void EMI()
	{
		double Emi=(Loanammount+((Loanammount*Rateofinterest)*Duration))/(Duration*12);
		System.out.println("Emi is "+Emi);
	}
	public void Downpayment()
	{
		int dpay=Costofproperty-Loanammount;
		System.out.println("Downpayment is "+dpay);
	}
}
class EducationLoan extends Loan
{
	private String NameofDegree;
	private String Typeofdegree;
	private String Collagename;
	private double DurationofDegree;
	private double Loanammount;
	private double Rateofinterest;
	private String FatherDetail;
	private String FatherIncomeDetail;
	private String Authorityname;
	private String CollageAddress;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,String nmd,String TOD,String cnm,double Dd,double Lammount,double roi,String Fatherd,String FID,String Anm,String cadd)
	{
		super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
		NameofDegree=nmd;
		Typeofdegree=TOD;
		Collagename=cnm;
		DurationofDegree=Dd;
		Loanammount=Lammount;
		Rateofinterest=roi;
		FatherDetail=Fatherd;
		FatherIncomeDetail=FID;
		Authorityname=Anm;
		CollageAddress=cadd;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("NameofDegree is "+NameofDegree);
		System.out.println("Typeofdegree is "+Typeofdegree);
		System.out.println("CollageName is "+Collagename);
		System.out.println("DurationofDegree is"+DurationofDegree);
		System.out.println("Loanammount is "+Loanammount);
		System.out.println("Rateofinterest is "+Rateofinterest);
		System.out.println("FatherDetail is "+FatherDetail);
		System.out.println("FatherIncomeDetail is "+FatherIncomeDetail);
		System.out.println("Authorityname is "+Authorityname);
		System.out.println("CollageAddress is "+CollageAddress);	
	}
	public void Emi()
	{
		double Emi=(Loanammount+((Loanammount*Rateofinterest)*DurationofDegree))/(DurationofDegree*12);
		System.out.println("Emi is "+Emi);
	}
	public void DisbasementAmmount()
	{
		double Damount=(Loanammount)/(DurationofDegree);
		System.out.println("Disbasement Ammount is "+Damount);
	}	
}
class PersonalLoan extends Loan
{
	private String Companyname;
	private int NOofExperienceYear;
	private int NOofYearofCurrentExpiComp;
	private String CurrentAddress;
	private String CompanyAddress;
	private int InhandSalary;
	private String JobProfile;
	private String SalaryAccountDetails;
	private String AnyOtherLoan;
	private int NOofSpouncenes;
	private double Loanammount;
	private double Rateofinterest;
	private double Duration;
	private double ProcessingFee;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,String cnm,int NEY,int NYCE,String Curradd,String Cadd,int IHS,String JP,String Sad,String AoL,int NS,double Lammount,double roi,double Dur,double Pf)
	{
		super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
		Companyname=cnm;
		NOofExperienceYear=NEY;
		NOofYearofCurrentExpiComp=NYCE;
		CurrentAddress=Curradd;
		CompanyAddress=Cadd;
		InhandSalary=IHS;
		JobProfile=JP;
		SalaryAccountDetails=Sad;
		AnyOtherLoan=AoL;
		NOofSpouncenes=NS;
		Loanammount=Lammount;
		Rateofinterest=roi;
		Duration=Dur;
		ProcessingFee=Pf;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Companyname is "+Companyname);
		System.out.println("NOofExperienceYear is "+NOofExperienceYear);
		System.out.println("NOofYearofCurrentExpiComp is"+NOofYearofCurrentExpiComp);
		System.out.println("CurrentAddress is "+CurrentAddress);
		System.out.println("CompanyAddress is"+CompanyAddress);
		System.out.println("InhandSalary is "+InhandSalary);
		System.out.println("JobProfile is "+JobProfile);
		System.out.println("SalaryAccountDetails is "+SalaryAccountDetails);
		System.out.println("AnyOtherLoan is "+AnyOtherLoan);
		System.out.println("NOofSpouncenes is"+NOofSpouncenes);
		System.out.println("Loanammount is "+Loanammount);
		System.out.println("Rateofinterest is "+Rateofinterest);
		System.out.println("Duration is "+Duration);
		System.out.println("ProcessingFee is "+ProcessingFee);
	}
	public void Emi()
	{
		double Emi=(Loanammount+((Loanammount*Rateofinterest)*Duration))/(Duration*12);
		System.out.println("Emi is "+Emi);
	}
	public void InhandAmmount()
	{
		double IA=(Loanammount)-(ProcessingFee);
		System.out.println("Inhand ammount is "+IA);
	}
}
class GoldLoan extends Loan
{
	private double Weightofgold;
	private String Description;
	private int AvgCarret;
	private String GoldSmithCertificate;
	private String GoldSmithName;
	private int CurrentMarketCost;
	private String Billdetails;
	private double Loanammount;
	private double RateofinterestPM;
	private double Duration;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,double wog,String des,int Avgc,String Gsc,String Gnm,int CMC,String BD,double Lammount,double roi,double dur)
	{
		super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
		Weightofgold=wog;
		Description=des;
		AvgCarret=Avgc;
		GoldSmithCertificate=Gsc;
		GoldSmithName=Gnm;
		CurrentMarketCost=CMC;
		Billdetails=BD;
		Loanammount=Lammount;
		RateofinterestPM=roi;
		Duration=dur;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Weightofgold is "+Weightofgold);
		System.out.println("Description is "+Description);
		System.out.println("AvgCarret is "+AvgCarret);
		System.out.println("GoldSmithCertificate is "+GoldSmithCertificate);
		System.out.println("GoldSmithName is "+GoldSmithName);
		System.out.println("CurrentMarketCost is "+CurrentMarketCost);
		System.out.println("Billdetails is "+Billdetails);
		System.out.println("Loanammount"+Loanammount);
		System.out.println("RateofinterestPM is "+RateofinterestPM);
		System.out.println("Duration is "+Duration);
	}
	public void Settlementamount()
	{
		double Samount=Loanammount+(RateofinterestPM*Loanammount)*Duration;
		System.out.println("Sammount is "+Samount);
	}
	
}
class CarLoan extends Loan
{
	private String TypeofCar;
	private double CostofCar;
	private String Companyname;
	private String Modelname;
	private String Fueltype;
	private String Chassisno;
	private int CCvalue;
	private int Engineno;
	private String Colour;
	private int ExShowroomPrice;
	private String AccessoriesDetails;
	private int AccessoriesPrice;
	private int insuranceAmount;
	private int RTOcharges;
	private double Loanammount;
	private double Rateofinterest;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,String toc,double coc,String cname,String mnm,String Ftype,String chano,int cv,int eno,String clr,int esp,String ad,int ap,int ia,int rtoc,double Lammount,double roi)
	{
	super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
	TypeofCar=toc;
	CostofCar=coc;
	Companyname=cname;
	Modelname=mnm;
	Fueltype=Ftype;
	Chassisno=chano;
	CCvalue=cv;
	Engineno=eno;
	Colour=clr;
	ExShowroomPrice=esp;
	AccessoriesDetails=ad;
	AccessoriesPrice=ap;
	insuranceAmount=ia;
	RTOcharges=rtoc;
	Loanammount=Lammount;
	Rateofinterest=roi;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("TypeofCar is "+TypeofCar);
		System.out.println("CostofCar is "+CostofCar);
		System.out.println("Companyname is "+Companyname);
		System.out.println("Modelname is "+Modelname);
		System.out.println("Fueltype is "+Fueltype);
		System.out.println("Chassisno is "+Chassisno);
		System.out.println("CCvalue is "+CCvalue);
		System.out.println("Engineno is"+Engineno);
		System.out.println("Colour is "+Colour);
		System.out.println("ExShowroomPrice is "+ExShowroomPrice);
		System.out.println("AccessoriesDetails is "+AccessoriesDetails);
	    System.out.println("AccessoriesPrice is "+AccessoriesPrice);
		System.out.println("insuranceAmount is "+insuranceAmount);
		System.out.println("RTOcharges is "+RTOcharges);
		System.out.println("Loanammount is "+Loanammount);
		System.out.println("Rateofinterest is "+Rateofinterest);
	}
	public void Downpayment()
	{
		double dpay=CostofCar-Loanammount;
	}
}
class BusinessLoan extends Loan
{
	private String TypeofBussiness;
	private String BusinessAddress;
	private String Ownertype;
	private String TOfServices;
	private double SharePercent;
	private double Loanammount;
	private double CapitalAmmount;
	private double Rateofinterest;
	private double Duration;
	private String BusinessName;
	
	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,String TOB,String Badd,String Owtype,String Tos,double SPer,double Lammount,double Cammount,double roi,double dur,String Bnm)
	{
		super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
		TypeofBussiness=TOB;
		BusinessAddress=Badd;
		Ownertype=Ownertype;
		TOfServices=Tos;
		SharePercent=SPer;
		Loanammount=Lammount;
		CapitalAmmount=Cammount;
		Rateofinterest=roi;
		Duration=dur;
		BusinessAddress=Bnm;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("TypeofBussiness is "+TypeofBussiness);
		System.out.println("BusinessAddress is "+BusinessAddress);
		System.out.println("Ownertype "+Ownertype);
		System.out.println("TOfServices is "+TOfServices);
		System.out.println("SharePercent is "+SharePercent);
		System.out.println("Loanammount is "+Loanammount);
		System.out.println("CapitalAmmount is "+CapitalAmmount);
		System.out.println("Rateofinterest is "+Rateofinterest);
		System.out.println("Duration is "+Duration);
		System.out.println("BusinessAddress is "+BusinessAddress);
	}
	public void EMI()
	{
		double Emi=(Loanammount+((Loanammount*Rateofinterest)*Duration))/(Duration*12);
		System.out.println("Emi is "+Emi);
	}
	public void TotalAsset()
	{
		double TA=CapitalAmmount+Loanammount;
		System.out.println("TotalAsset is "+TA);
	}
}
class FarmingLoan extends Loan
{
	private int GstNo;
	private String SaatbaraDetails;
	private String TypeofLand;
	private String PikpaniDetails;
	private double Loanammount;
	private double Duration;
	private double Rateofinterest;
	private double Sharescut;

	public void setdata(String Fnm,String Mnm,String Lnm,String Add,int Pan,int Adh,String RD,String Ip,int Dob,int Gno,String SD,String Tol,String Pikd,double Lammount,double Dur,double roi,double Sc)
	{
		super.setdata(Fnm,Mnm,Lnm,Add,Pan,Adh,RD,Ip,Dob);
		GstNo=Gno;
		SaatbaraDetails=SD;
		TypeofLand=Tol;
		PikpaniDetails=Pikd;
		Loanammount=Lammount;
		Duration=Dur;
		Rateofinterest=roi;
		Sharescut=Sc;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("GstNo is "+GstNo);
		System.out.println("SaatbaraDetails is "+SaatbaraDetails);
		System.out.println("TypeofLand "+TypeofLand);
		System.out.println("PikpaniDetails "+PikpaniDetails);
		System.out.println("Loanammount is "+Loanammount);
		System.out.println("Duration is "+Duration);
		System.out.println("Rateofinterest is "+Rateofinterest);
		System.out.println("Sharescut is "+Sharescut);
	}
	public void Settlementamount()
	{
		double Samount=Loanammount+(Rateofinterest*Loanammount)*Duration;
		System.out.println("Sammount is "+Samount);
	}
	public void InhandAmmount()
	{
		double IA=Loanammount-Sharescut;
		System.out.println("InhandAmmount is "+IA);
	}
}

class Loantest
{
	public static void main(String [] args)
	{
	Homeloan H1=new Homeloan();
	H1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998,"Addharcard","Flat",7000,10000,"Agent","sham","Mobno",5000000,1000000,0.10,5);
	H1.showdata();
	H1.EMI();
	H1.Downpayment();
	
	EducationLoan E1=new EducationLoan();
	E1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998,"Engg","UG","KIT",4,500000,0.10,"Panno","Salaryslip","mahesh","Gokulshirgoan");
	E1.showdata();
	E1.Emi();
	E1.DisbasementAmmount();
	
	PersonalLoan P1=new PersonalLoan();
	P1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998,"Tcs",20,10,"Shahupark","pune",20000,"Developer","Passbook","No",4,1000000,0.02,4,0.02);
	P1.showdata();
	P1.Emi();
	P1.InhandAmmount();
	
	GoldLoan G1=new GoldLoan();
	G1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998, 22,"Neckles",24,"Yes","ROCKY",60000,"Tanishq",500000,0.10,5);
	G1.showdata();
	G1.Settlementamount();
	
	CarLoan C1=new CarLoan();
	C1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998,"sedan",1400000,"suzuki","ciaz","Diesel","ABCD",250,500,"black",1600000,"Cover",10000,25000,5000,100000,0.10);	
	C1.showdata();
	C1.Downpayment();
	
	BusinessLoan B1=new BusinessLoan();
	B1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998,"Partnership","Marli","Student","Selling",0.20,2000000,500000,0.10,5,"RemouldFactory");
	B1.showdata();
	B1.EMI();
	B1.TotalAsset();
	
	FarmingLoan F1=new FarmingLoan();
	F1.setdata("Raj","shardul","Mane","itpark",6789,1234,"Passbook","IncomeCertificate",20071998,2567,"Yes","Grassland","Shugarcane",2000000,5,0.10,0.4);
	F1.showdata();
	F1.Settlementamount();
	F1.InhandAmmount();
	}
}


























