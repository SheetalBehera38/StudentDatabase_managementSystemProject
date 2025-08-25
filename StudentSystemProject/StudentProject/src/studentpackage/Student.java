package studentpackage;

import java.util.Scanner;

public class Student {

	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String firstName;
		private String lastName;
		private int gradeYear;
		private String studentID;
		private String courses="";
		private int tuitionBalance=0;
		private static int costofCourse=600;
		private static int id=1000;
		
		public Student() {
			Scanner in= new Scanner(System.in);
			System.out.print("Enter the first name:");
			this.firstName=in.nextLine();
			System.out.print("Enter the last name:");
			this.lastName=in.nextLine();
			System.out.print("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level:");
			this.gradeYear=in.nextInt();
			setstudentID();
			
			

	}
		private void setstudentID() {
			id++;
			this.studentID=gradeYear + " " + id;
			
		}
		public void enroll()
		{
			do {
			System.out.print("Enter course to enroll(Q to quit):");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) {
				courses=courses + "\n"+course;
			    tuitionBalance = tuitionBalance + costofCourse;
			}
			else {
				
				break;
			}
			}while(1!=0);
		
		
			
			
		
		
		System.out.println("Tuition Balance="+tuitionBalance);
		}
		public void viewBalance() {
			System.out.println("your balance is: Rs"+tuitionBalance);
		}
		public void payTuition()
	
		
		{
			Scanner in=new Scanner(System.in);
			System.out.print("Enter your payment:Rs");
			int payment=in.nextInt();
			tuitionBalance=tuitionBalance-payment;
			System.out.println("Thank You for your payement of Rs"+payment);
			viewBalance();
		}
		public String toString() 
		{
			
			return "Name: "+ firstName +" " +lastName + 
					"\nGrade Level:" + gradeYear+
					"\nStudent ID: " +studentID+
					"\nCourses Enrolled:" + courses +
					"\nBalance: Rs"+ tuitionBalance;
		}
}


