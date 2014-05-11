package org.example.B;

import org.example.Greeting;
import org.example.C.ClassC;

public class ClassB implements Greeting {

	public void sayHello() {
		new ClassC().sayHello();		
	}

}
