package primary;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DynamicClassCreation {
	static DynamicClassCreation myDynamicClassCreation;
	
	private DynamicClassCreation() {
		
	}
	
	public static DynamicClassCreation getInstance() {
		if(myDynamicClassCreation == null) {
			myDynamicClassCreation = new DynamicClassCreation();
		}
		return myDynamicClassCreation;
	}
	
	public void createClass(String fileName) {
		System.out.println("Start of createCLass");
		 Class<?> dynamicClass = null;
			try {
				dynamicClass = Class.forName(""+fileName);
				System.out.println("Dynamic Class assigned");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    Constructor tc = null;
			try {
				tc = dynamicClass.getConstructor();
				System.out.println("Constructor Created");
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				Object t = tc.newInstance();
				System.out.println("Object Instatiated");
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		
	}
	
	
	
}
