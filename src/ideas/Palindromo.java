package ideas;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cadena a validar");
		String pali = sc.next();
		if(pali.length() > 5) {
			String normal = "";
			String reverse = "";
			for(int i = 0; i < pali.length(); i++) {
				normal += pali.charAt(i);
			}
			System.out.println(normal);
			System.out.println(pali.length());
			for(int j = pali.length() -1  ; j >=0  ; j--) {
				reverse += pali.charAt(j);
			}
			System.out.println(reverse);
			
			if( normal.equals(reverse)) {
				System.out.println("La cadena ingresada es palindromo");
			}else {
				System.out.println("La cadena ingresada no es palindromo");
			}
		}else {
			System.out.println("Debe ingresar una cadena de mas de 5 caracteres.");
		}
		
	}
	
}
