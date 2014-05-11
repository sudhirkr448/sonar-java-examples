package org.example.C;

import org.example.Greeting;
import org.example.D.ClassD;

public class ClassC implements Greeting {

	public void sayHello() {
		new ClassD().sayHello();
	}

}
