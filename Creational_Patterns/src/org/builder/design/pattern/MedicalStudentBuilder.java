package org.builder.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class MedicalStudentBuilder extends StudentBuilder {
	
	@Override
	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<String>();
		subs.add("Microbiology");
		subs.add("Anatomy");
		subs.add("Medicine");
		subs.add("Physiology");
		this.subjects = subs;
		return this;
	}
}
