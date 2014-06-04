package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ClassA {

	public void execute() {
		int x = 10000;
		x *= 2;
		x %= 100;
	}
	
	public void doExecute() {
		int x = 10000;
		x *= 2;
		x %= 100;
	}
	
	public void duplicatedStringLiterals() {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
		System.out.println("Hi!");
		System.out.println("Hi!");
		
		System.out.println("Hello Sonar!");
		System.out.println("Hello Sonar!");
	}
	
	protected static void copyFileUsingFileStreams(File source, File dest)
		        throws IOException {
		    InputStream input = null;
		    OutputStream output = null;
		    try {
		        input = new FileInputStream(source);
		        output = new FileOutputStream(dest);
		        byte[] buf = new byte[1024];
		        int bytesRead;
		        while ((bytesRead = input.read(buf)) > 0) {
		            output.write(buf, 0, bytesRead);
		        }
		    } finally {
		        input.close();
		        output.close();
		    }
		}
}
