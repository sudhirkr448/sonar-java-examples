package org.example;

public class ClassA {
	
	/*!! Verletzungen !!*/
    private void displayMessage(String message){
    	System.out.println(message);
    }
    
    /*!! Verletzungen !!*/
    protected void displayMessage(String message, int times){
    	while(times > 0) {
    		System.out.println(message);
    		--times;
    	}
    }
    
    public void sayHello() {
    	/*!! Verletzungen !!*/
    	String.format("%s: %s", new ClassB().getDateAsString(), "Hello Sonar");
    }
	
}
