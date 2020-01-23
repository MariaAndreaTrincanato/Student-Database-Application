package studentdbapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private String tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//TODO: Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen \n2 - Sophmore \n3 - Junior \n4 - Senior \n\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		
		setStudentID();
		//Print out student info
		System.out.println(firstName+ " "+ lastName+" "+gradeYear+" "+studentID);
	}
	
	
	//Generate ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear +""+ id;
	}
	
	//Enroll in course
	
	
	//View balance
	
	//Pay tuition
	
	//Show status
	
	
}
