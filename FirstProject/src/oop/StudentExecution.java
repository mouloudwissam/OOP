package oop;

public class StudentExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentInf studentinfo = new StudentInf();
studentinfo.Setage(10);
int newAge = studentinfo.GetAge();
studentinfo.SetName("MOULOUD");
String newName = studentinfo.GetName();
studentinfo.SetDOB("10/11/1995");
String newDOB = studentinfo.GetDOB();
System.out.println(newAge);
System.out.println(newName);
System.out.println(newDOB);

	}

}
