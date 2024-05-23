package PruebaPrimerCuatri;

import java.util.Scanner;

public class PruebaPrimerCuatri {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	int[] codigo = {2022, 2777, 8748, 1121, 9817, 4568, 2423, 2534};
	
	String[] nombres = {"Esteban", "Daniel", "Maite", "Luis", "Micaela", "Hernan", "Morena", "Hugo"};
	
	int tictac;
	
	System.out.println("Para encontrar a un individuo, ingresar n�mero de socio: ");
	tictac = entrada.nextInt();
	
	for (int pum = 0; pum<codigo.length; pum++) {
		
		if (tictac == codigo[pum]) {
		System.out.println("Se encontro al socio: "+nombres[pum]+" y su numero de socio es: "+codigo[pum]);
		 	}
	 	}
	}
}
