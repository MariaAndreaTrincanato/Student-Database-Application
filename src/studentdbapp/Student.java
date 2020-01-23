package studentdbapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//TODO: Constructor: prompt user to enter student's name and year
	public Student() {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("Enter student first name: ");
			this.firstName = in.nextLine();
		
			System.out.print("Enter student last name: ");
			this.lastName = in.nextLine();
		
			System.out.print("1 - Freshmen \n2 - Sophomore \n3 - Junior \n4 - Senior \n\nEnter student class level: ");
			this.gradeYear = in.nextInt();
		}
		
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
	public void enroll() {
		
		do {
				System.out.print("Enter course to enroll (Q to quit): ");
				//try(Scanner in = new Scanner(System.in)){
					Scanner in = new Scanner(System.in);
					String course = in.nextLine();
					
					if ((!course.equals("Q")) & (!course.equals("q")) & (course !=null)){
						courses = courses + "\n"+ course;
						tuitionBalance = tuitionBalance + costOfCourse;
					}
					else {
						System.out.println("BREAK!");
						break;
					}	
//				}
//				catch(Exception e) {
//					System.out.print("Error: "+e);
//				}	
		}
		while(1 != 0);
			
	}
	
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is $ "+tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		try(Scanner in = new Scanner(System.in)){
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of $ "+ payment);
			viewBalance();
		}
	}
	
	//Show status
	public String showInfo() {
		return "Name: "+ firstName + " "+lastName +
				"\nGrade level: "+gradeYear +
				"\nStudentID: "+studentID +
				"\nCourses enrolled: "+courses +
				"\nBalance: $"+ tuitionBalance;
	}
	
	
}
