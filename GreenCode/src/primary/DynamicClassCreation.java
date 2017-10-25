package primary;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;



public class DynamicClassCreation {
	//	final private static String  ESTABLISHED_CLASS_PATH = "package temporaryClassHolder;";
	//final private static String  TEMPORARY_CLASS_PATH = "package temporaryClassHolder;";

	static DynamicClassCreation myDynamicClassCreation;



	public static DynamicClassCreation getInstance() {
		if(myDynamicClassCreation == null) {
			myDynamicClassCreation = new DynamicClassCreation();
		}
		return myDynamicClassCreation;
	}

	public void createClass(String fileName) throws Exception{
		//file is is another package.

	//	System.out.println("Working Directory = " + System.getProperty("user.dir"));
	//	String totalPathToCLass = System.getProperty("user.dir");
		//System.out.println(totalPathToCLass);
		
		//File classesDir = new File(System.getProperty("user.dir")+"/src/temporaryClassHolder/");
		
		File brotaco = new File("");
	//	String path = brotaco.getCanonicalPath()+"\\src\\temporaryClassHolder\\";
	//	System.out.println("Brotaco: "+path);
		//System.out.println(classesDir.getCanonicalPath());
		
	//	ClassLoader systemClassLoader = ClassLoader.getSystemResource(brotaco.getCanonicalPath());
		URLClassLoader urlcl = new URLClassLoader(
				new URL[] {
						new File(System.getProperty("user.dir")
								+ "/src/temporaryClassHolder/").toURI().toURL()
						});
		
		
		//@SuppressWarnings("unused")
		//Class<?> dynamicClass = Class.forName("src.temporaryClassHolder.TestThisClass");
		
	//	System.out.println("***CREATED DYNAMIC CLASS***");
		//	Class.forName(fileName);
/*
		Constructor<?> tc = dynamicClass.getConstructor();
		System.out.println("Constructor Created");

		Object t = tc.newInstance();
		System.out.println("Object Instatiated");

*/


	}



}
