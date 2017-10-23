package primary;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.UUID;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import temporaryClassHolder.TemporaryPackageHandler;

public class Launch {
	static ImportCode myImportCode = ImportCode.getInstance();
	static TemporaryPackageHandler myTempPackHandler = TemporaryPackageHandler.getInstance();
	static DynamicClassCreation myClassCreator = DynamicClassCreation.getInstance();
	static DirectoryWatch myDirWatch = DirectoryWatch.getInstance();
	private static Thread watcherThread;





	public static void main(String[] args) {
		
		watcherThread = new Thread() {
		    public void run() {
		        myDirWatch.startDirWatch("");
		    }  
		};
		watcherThread.start();
	
		myImportCode.fileReadIn( "incoming_test.txt");
		String newUUID = UUID.randomUUID().toString().replace("-", "");
		String newFileName = newUUID + ".java";
		String desiredPath = "src/temporaryClassHolder/";
		myTempPackHandler.saveFile(desiredPath+newFileName, myImportCode.getReadInList());
		

		
		
		myClassCreator.createClass(desiredPath+newFileName);

		/*
		 * Needs to happen after watcher fires.
		 */



	}


}
