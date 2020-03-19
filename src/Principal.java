import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // SCANNER
		
		BinaryTree bt = new BinaryTree();
		
		Map<String, String> mapa = new HashMap<String, String>();
		
		Map<String, String> m = bt.importText(mapa);
		
		System.out.println("INGRESE LA OPCION DE LO QUE DESEA HACER; \n" // IMPLEMENTACION A UTILIZAR
				+ "1. VER ARBOL\n"
				+ "2. REALIZAR TRADUCCION");
		
		int opcion = scan.nextInt();
		scan.nextLine();
		
		if(opcion == 1) {
			
			for (Map.Entry<String, String> entry : m.entrySet()) {
			    System.out.println("KEY "+entry.getKey()+" | VALUE " + entry.getValue()); 
			}
		} else if(opcion == 2) {
			System.out.println("*The*mujer*asked*me*to*do*my*tarea*about*my*pueblo.");
		}
		
		

	}

}
