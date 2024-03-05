package org.builder.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<String>();
		subs.add("DSA");
		subs.add("DBMS");
		subs.add("Computer network");
		this.subjects = subs;
		return this;
	}

}
