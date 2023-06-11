import java.util.*;
public class Main {
	/**
	 * El metodo recibe los valores para el arreglo
	 * @author: Leonardo Mendez
	 * @return 
	 */
	public static ArrayList<Integer> numeros(int numero1, int numero2) {
		/**
		 * Se le dan valor a las variables
		 * Se establece una variable que llevara el conteo
		 * @param: conteo, se encargara de generar los numeros que estaran dentro del arreglo
		 * Se inicializa un ArrayList llamada list, la cual guardara los numeros que esten
		 * entre los 2 numeros ingresados, seria la secuencia
		 */
		
		final int primerNumero = numero1;
		final int ultimoNumero = numero2;
		int conteo = 0;
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		/**
		 * El ciclo for sirve para generar los numeros de secuencia
		 * Ademas de guardarlos dentro del ArrayList 
		 */
		for(conteo = primerNumero+1; conteo < ultimoNumero; conteo++) {
			if(conteo%2 == 0) {
				list.add(conteo);
			}
		}
		/**
		 * El metodo imprimir, mostraria en pantalla la secuencia pedida
		 * al ingresar list como uno de sus valores
		 */
		imprimir(list);
		return list;
	}
	
	/**
	 * El metodo imprimir, imprimira los datos que se generaron en el ciclo
	 * @param list, es agarrado del arraylist generado en el metodo anterior
	 */
	
	public static void imprimir(ArrayList <Integer> list) {
		System.out.print("Lista de numeros: " + list);
	}
	
	/**
	 * Metodo main 
	 */
	public static void main(String args []) {
		/**
		 * @param dato, es la variable que sirve para ingresar los datos numericos
		 */
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero: ");
		int num1 = dato.nextInt();
		System.out.println("Ingrese segundo numero: ");
		int num2 = dato.nextInt();
		
		/**
		 * Se ingresan los valores para el metodo imprimir 
		 */
		numeros(num1, num2);
	}
}
