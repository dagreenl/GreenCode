package primary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportCode {
	
	static ImportCode myImportCode;
	private ArrayList<String> readInList;

	
	public static ImportCode getInstance() {
		if( myImportCode == null) {
			myImportCode = new ImportCode();
		}

		return myImportCode;
	}
	
	private ImportCode() {

	}


	public void fileReadIn(String fileLocation) {
		
		System.out.println(fileLocation);
		
		
		File myFile = new File(fileLocation);
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		readInList = new ArrayList<String>();

		while(scanner.hasNextLine()) {
			String incomingLine = scanner.nextLine();
			readInList.add(incomingLine);
		}

	}
	
	public ArrayList<String> getReadInList(){
		
		return readInList;
		
	}
	






}