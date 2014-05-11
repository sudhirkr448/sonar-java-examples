package org.example;

import java.util.Date;

public class ClassB {

	@Deprecated
	public String getDateAsString() {
		return String.valueOf(new Date());
	}
}
