import java.util.*;

class Student{
	int rollNo;
	String name;
	String course;
	double g1, g2, g3;

	public void printStudent(){
		System.out.println("The name of the student is: " + name);
		System.out.println("The course name is: " + course);
		System.out.println("The student roll number is: " + rollNo);
	}
	public double totalGrade(){
		return (g1 + g2 + g3);
	}
	public double average(){
		return totalGrade()/3;
	}
	public char grade(){
		if(totalGrade() >= 250){
			return 'A';
		}
		else if(totalGrade() >= 150){
			return 'B';
		}
		else{
			return 'C';
		}
	}
}
public class student{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();

		s1.name = sc.nextLine();
		s1.rollNo = sc.nextInt();
		sc.nextLine();
		s1.course = sc.nextLine();
		s1.g1 = sc.nextInt();
		s1.g2 = sc.nextInt();
		s1.g3 = sc.nextInt();

		s1.printStudent();
		
		System.out.println("Total grade of Student is: " + s1.totalGrade());
		System.out.println("The average of the Student is: " + s1.average());
		System.out.println("The Letter grade of the Student is: " + s1.grade());
		sc.close();
	}
}

