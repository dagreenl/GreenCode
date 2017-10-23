package temporaryClassHolder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TempFileManager {
	static TempFileManager myTempFileManager;
	
	public static TempFileManager getInstance() {
		
		if(myTempFileManager == null) {
			myTempFileManager = new TempFileManager();
		}
		
		return myTempFileManager;
	}
	
	private void myTempFileManager() {
		
	}
	
	
	public void saveFile(String desiredFileName, ArrayList<String> readInList) {
		System.out.println("saveFile: "+desiredFileName);
		
		PrintWriter writer = null;
		try {
			
			writer = new PrintWriter(desiredFileName);
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		for(String fileLine : readInList) {
			writer.println(fileLine);
		}
		
		readInList = null;
		writer.close();
		
	}
	
	
}