package bs23;

import java.util.Scanner;

class Student{
	int iD;
	String firstName;
	double CGPA;
	Student(int iD, String firstName,double CGPA){
		this.iD = iD;
		this.firstName = firstName;
		this.CGPA = CGPA;
	}
}
public class main {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		Student[] students = new Student[n];
		
		for(int i=0;i<n;i++) {
			int iD = scan.nextInt();
			String firstName = scan.next();
			double CGPA = scan.nextDouble();
			students[i] = new Student(iD,firstName,CGPA);
		}
		
		for(int i=0;i<n;i++) {
			for(int j =0; j<n && i!=j; j++) {
				if(students[i].CGPA > students[j].CGPA) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp; 
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(students[i].firstName+students[i].CGPA);
		}
		
		
	}
}

/*
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
 */
