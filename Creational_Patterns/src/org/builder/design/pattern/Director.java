package org.builder.design.pattern;

public class Director {
	
	StudentBuilder studentBuilder;
	
	public Director(StudentBuilder studentBuilder) {
		this.studentBuilder = studentBuilder;
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}
		else if(studentBuilder instanceof MedicalStudentBuilder) {
			return createMedicalStudent();
		}
		return null;
	}
	
	private Student createEngineeringStudent() {
		return studentBuilder.setRollNumber(1).setAge(22).setName("Rohan Kumar").setSubjects().build();
	}
	
	private Student createMedicalStudent() {
		return studentBuilder.setRollNumber(3).setAge(18).setName("Tinku Kumar")
				.setMotherName("Sita").setFatherName("Ashok").setSubjects().build();
	}
}
