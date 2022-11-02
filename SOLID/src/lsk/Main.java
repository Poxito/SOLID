package lsk;

public class Main {

	public static void main(String[] args) {
		
		//1. Puntuan egin beharrekoa
		Project proiektua = new Project();
		
		ProjectFile pf1 = new ReadOnlyProjectFile("enuntziatua.pdf");
		ProjectFile pf2 = new ProjectFile("txostena.pdf");
		//Errefaktorizazioaren ostean ez du ongi egingo.
		
		proiektua.addProject(pf1);
		proiektua.addProject(pf2);
		
		proiektua.loadAllFiles();
		proiektua.storeAllFiles();
		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		//4. galderako errefaktorizazioaren probak
		Project project = new Project();
		
		ProjectFile pf3 = new ReadOnlyProjectFile("kalifikazioa.pdf");
		ProjectFile pf4 = new StoreableProjectFile("azterketa.pdf");
		
		project.addProject(pf3);
		project.addProject(pf4);
		
		project.loadAllFiles();
		project.storeAllFiles();
		
	}

}
