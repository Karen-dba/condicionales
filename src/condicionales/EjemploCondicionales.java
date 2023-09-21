package condicionales;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hola mundo");

		int edad = 17;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
		} 
		else {
			if (cantidad >= 2) {
				System.out.println("Ustes es menor de edad " 
						+ "pero es permitido que entre");
			}
			else {
				System.out.println("Usted no tiene permitido"
						+ " entrar");
			}
			
		}

	}
}
