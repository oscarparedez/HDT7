import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class BinaryTree {
	
	
	private String path = System.getProperty("user.dir");
	private File file = new File(path+"\\dictionary.txt");
	
	public Map<String, String> importText(Map<String, String> hash) {
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				
				String linea = scan.nextLine();
				linea = linea.substring(linea.indexOf("(")+1,linea.indexOf(")"));
				String [] palabras = linea.split(",");
				palabras[1] = palabras[1].substring(1, palabras[1].length());
				hash.put(palabras[0], palabras[1]);
				Arrays.fill(palabras, null);
		
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return hash;
	}
	
	public Node addRecursive(Node current, String value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value.compareTo(current.value) < 1) {
	        current.left = addRecursive(current.left, value);
	    } else if (value.compareTo(current.value) > 1) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        return current;
	    }
	 
	    return current;
	}
	
	public void add(String value) {
	    Node root = addRecursive(root, value);
	}
	

}