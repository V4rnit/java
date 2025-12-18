import java.util.*;

class Subject{
	private String subId;
	private String name;
	private int maxMarks;
	private int  marksObtain;
	//Constructor
	Subject(String subId, String name){
		this.subId = subId;
		this.name = name;
	}
	Subject(String subId, String name, int maxMarks){
		this.subId = subId;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	//Property Methos(Getters / Setters)
	//Getters
	public String getSubId(){
		return subId;
	}
	public String getName(){
		return name;
	}
	public int getMaxmarks(){
		return maxMarks;
	}
	public int getMarksObtain(){
		return marksObtain;
	}
	//Setters
	public void setMarks(int maxMarks){
		this.maxMarks = maxMarks;	
	}
	public void setMarksObtain(int marksObtain){
		this.marksObtain = marksObtain;
	}
	public boolean isQualified(){
		return marksObtain >= maxMarks / 10 * 4;
	}
	public String toString(){
		return "\nSubject ID :" + subId + "\nName :" + name + "\nMarks Obtained :"
			+marksObtain;
	}
}
class Student{
	private String rollNo;
	private String name;
	private String dept;
	private Subject [] subjects;

	//Constructor
	Student(String rollNo, String name, String dept, Subject [] subjects){
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.subjects = subjects;
	}
	//Getters
	public String getRollNo(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	public String getDept(){
		return dept;
	}
	public Subject[] getSubjects(){
		return subjects;
	}
	//Setters
	public void setDept(String dept){
		this.dept = dept;
	}
	public void setSubjects(Subject[] subjects){
		this.subjects = subjects;
	}
	public void printStudent(){
		System.out.println("Student info is: " + getName() + " " + getRollNo() + " " + getDept());
		for(Subject s : subjects){
			System.out.println(s);
		}
	}
}

public class arrayObjects{
	public static void main(String [] args){
		Subject [] s = new Subject [3];
		s[0] = new Subject("s101", "OOP", 100);
		s[1] = new Subject("s102", "DSA", 100);
		s[2] = new Subject("s103", "MATH", 100);

		Student newStudent = new Student("989", "Varnit", "CS/IT", s);

		newStudent.printStudent();
	}
}
