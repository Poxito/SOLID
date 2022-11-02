package lsk;

public class StoreableProjectFile extends ProjectFile implements IStoreFile{

	
	public StoreableProjectFile(String filePath) {
		super(filePath);
	}

	public void storeFile(){
		System.out.println("file saved to " + filePath);
	}
}
