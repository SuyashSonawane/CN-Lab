import java.util.Scanner;

/*
 * Author: Suyash Sonawane TECOB261
 * 
 * Problem Statement
 * 
 * Write a Java program to create students database. 
 * Take run time marks for 5 subjects from user and calculate 
 * percentage, class (first class, second class, pass, fail) and display on screen.
 */

// Student class for holding each student records
class Student{
	String name;
	int id;
	String grade="NULL";
	
	double [] marks = new double[5];
	public Student(String name , int id)
	{
		this.name = name;
		this.id =id;		
	}
	
//	Function for accepting marks
	public void acceptMarks()
	{
		System.out.println("Enter data for "+this.name);
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<6;i++)
		{
			System.out.println("Enter marks for subject "+i+" >");
			this.marks[i-1] = sc.nextDouble();
		}
		
		
	}
//	Function for calculating grades
	public void CalculateGrade()
	{
		double sum=0;
		for(int i=0;i<5;i++)
			sum+=this.marks[i];
		
		double percentage = sum/500;
		System.out.println(sum+" "+percentage);
		if(percentage > 0.75)
			this.grade="First Class";
		
		else
			if(percentage > 0.65)
				this.grade = "Second Class";
		
			else
				if(percentage >0.55)
					this.grade ="Pass";
		
				else
					this.grade ="Fail";
		
		System.out.println("Student "+this.name +" has "+this.grade +" grade.\nTotal: "
				+sum+"\nPercentage: "+percentage*100);
		
	}
}


public class Sample_Program {

	public static void main(String[] args) {
		
		final int DATABASE_LENGTH =5; 
		
//		Database in the form of object array.
		Student [] students = new Student[DATABASE_LENGTH];
		
		System.out.println("Database size "+DATABASE_LENGTH+" Students\n5 Subjects are considered(Total 500 Marks)\n\n");
		
		for(int i=0;i<DATABASE_LENGTH;i++)
		{
			students[i] =  new Student("user"+i,i);
			students[i].acceptMarks();
			students[i].CalculateGrade();
		}
		

	}

}

/*

SampleProgram.java

Database size 5 Students
5 Subjects are considered(Total 500 Marks)


Enter data for user0
Enter marks for subject 1 >
87
Enter marks for subject 2 >
89
Enter marks for subject 3 >
95
Enter marks for subject 4 >
88
Enter marks for subject 5 >
81
440.0 0.88
Student user0 has First Class grade.
Total: 440.0
Percentage: 88.0
Enter data for user1
Enter marks for subject 1 >
74
Enter marks for subject 2 >
77
Enter marks for subject 3 >
65
Enter marks for subject 4 >
84
Enter marks for subject 5 >
74
374.0 0.748
Student user1 has Second Class grade.
Total: 374.0
Percentage: 74.8
Enter data for user2
Enter marks for subject 1 >
65
Enter marks for subject 2 >
74
Enter marks for subject 3 >
64
Enter marks for subject 4 >
77
Enter marks for subject 5 >
78
358.0 0.716
Student user2 has Second Class grade.
Total: 358.0
Percentage: 71.6
Enter data for user3
Enter marks for subject 1 >
60
Enter marks for subject 2 >
54
Enter marks for subject 3 >
45
Enter marks for subject 4 >
50
Enter marks for subject 5 >
65
274.0 0.548
Student user3 has Fail grade.
Total: 274.0
Percentage: 54.800000000000004
Enter data for user4
Enter marks for subject 1 >
87
Enter marks for subject 2 >
54
Enter marks for subject 3 >
47
Enter marks for subject 4 >
96
Enter marks for subject 5 >
45
329.0 0.658
Student user4 has Second Class grade.
Total: 329.0
Percentage: 65.8




*/



