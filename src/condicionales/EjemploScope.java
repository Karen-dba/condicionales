package condicionales;

public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hola mundo");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		
		if (cantidadPersonas>1) {
			esPareja=true;
		}
		else {
			esPareja=false;
		}
		
		
		boolean puedeEntrar=edad >= 18 && esPareja;
		//System.out.println("el valor de la condicion es: "
				//+ esPareja);

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} 
		else {
			System.out.println("Usted no tiene permitido"
					+ " entrar");
		}
	}
}
