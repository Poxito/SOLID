package lsk;

public class ReadOnlyProjectFile extends ProjectFile{

	public ReadOnlyProjectFile(String filePath) {
		super(filePath);
	}
	
	public void storeFile() {
		 System.out.println("ERROR, can not be Saved");
	}
		
}
