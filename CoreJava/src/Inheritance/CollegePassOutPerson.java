package Inheritance;

public class CollegePassOutPerson extends SchoolPassOutPerson{

	String collegeCertificateNo;
	
	CollegePassOutPerson(int id,String name,String schoolCertificateNo,String collegeCertificateNo)
	{
		super(id,name,schoolCertificateNo);
		this.collegeCertificateNo=collegeCertificateNo;
	}
}
