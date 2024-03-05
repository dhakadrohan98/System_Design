package org.builder.design.pattern;

public class Client {

	public static void main(String[] args) {
		Director directorObj1 = new Director(new EngineeringStudentBuilder());
		Director directorObj2 = new Director(new MedicalStudentBuilder());
		
		Student engineerStudent = directorObj1.createStudent();
		Student medicalStudent = directorObj2.createStudent();
		
		System.out.println(engineerStudent);
		System.out.println(medicalStudent);
	}

}
