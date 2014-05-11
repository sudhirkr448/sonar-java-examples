package org.example.D;

import org.example.Greeting;
import org.example.B.ClassB;

public class ClassD implements Greeting {

	public void sayHello() {
		new ClassB().sayHello();
	}
}
