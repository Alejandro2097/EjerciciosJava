package ideas;

import java.util.ArrayList;
import java.util.Scanner;

public class Colection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tamaño de la lista");
		int num =  sc.nextInt();
		ArrayList<Integer> lista = new  ArrayList<Integer>();
		for(int i = 0; i < num; i++) {
			System.out.println("Ingrese el numero: " + (i+1));
			int x = sc.nextInt();
			lista.add(x);
		}
		System.out.print(lista);
		burbuja(lista);
		System.out.println("Ingrese el valor a buscar");
		int search = sc.nextInt();
		if(binaria(lista, search ) == -1) {
			System.out.println("El valor no fue encontrado en el arreglo");
		}else {
			System.out.println("El valor  fue encontrado en el arreglo  en la posicion " + binaria(lista, search ));
		}
        
	}
	//Ordenamiento por incercion
	public static void insercion(ArrayList<Integer> lista) {
		int pos, aux;
		for (int i = 0; i< lista.size(); i++) {
			pos = i;
			aux = lista.get(i);
			while((pos > 0) && (lista.get(pos -1 ) > aux)) {
				lista.set(pos, lista.get(pos -1 ) );
				pos--;
			}
			lista.set(pos, aux);
		}
		System.out.println("Ordenado por incesrion");
		for(int i = 0; i< lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		System.out.println("");
	}
	//Metodo Burbuja
	public static void burbuja(ArrayList<Integer> lista) {
		int aux;
		for(int i = 0; i < (lista.size() -1); i++) {
			for(int j = 0; j < (lista.size() -1); j++) {
				if(lista.get(j) > lista.get(j + 1)) { // Si numero actual es mayor a numero siguiente
					aux = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j +1, aux);	
				}
			}
		}
		//Show the list in order
		System.out.println("Ordenado por incesrion");
		for(int i = 0; i< lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		System.out.println("");
	}
	public static void lineal(ArrayList<Integer> lista, int data) {
		int i = 0;
		boolean finded = false;
		while(i < lista.size() && finded == false) {
			if(lista.get(i) == data) {
				finded =  true;
			}
			i++;
		}
		if(finded == true) {
			System.out.println("El valor " + data + "fue encontrado en el arreglo");
		}else {
			System.out.println("El valor " + data + "No fue encontrado en el arreglo");
		}
	}
	public static int binaria(ArrayList<Integer> lista, int x) {
        int lo = 0, hi = lista.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (lista.get(mid) == x)
                return mid;

            if (lista.get(mid) < x)
                lo = mid + 1;

            else
                hi = mid - 1;
        }
        return -1;

	}
}
