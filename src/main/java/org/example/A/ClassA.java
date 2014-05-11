package org.example.A;

import org.example.Greeting;
import org.example.B.ClassB;

public class ClassA implements Greeting {

	public void sayHello() {
		new ClassB().sayHello();
	}

}
