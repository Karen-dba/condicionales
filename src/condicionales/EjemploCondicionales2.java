package condicionales;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hola mundo");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja=cantidadPersonas>1;
		boolean puedeEntrar=edad >= 18 && esPareja;
		System.out.println("el valor de la condicion es: "
				+ esPareja);

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} 
		else {
				System.out.println("Usted no tiene permitido"
						+ " entrar");
		}

	}
}
