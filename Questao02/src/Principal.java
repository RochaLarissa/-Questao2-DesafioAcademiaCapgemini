import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Algoritmo senha forte: construa um algoritmo que informe qual � o n�mero
		 * m�nimo de caracteres que devem ser adicionados para uma string qualquer ser
		 * considerada segura. Caracter�sticas de senha forte: Possui no m�nimo 6
		 * caracteres. Cont�m no m�nimo 1 digito. Cont�m no m�nimo 1 letra em min�sculo.
		 * Cont�m no m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1 caractere especial.
		 * Os caracteres especiais s�o: !@#$%^&*()-+
		 */

		// ABRINDO A ENTRADA PARA RECEBER O NUMERO DE DEGRAUS NO CONSOLE
		Scanner s = new Scanner(System.in);

		System.out.println("Informe uma senha forte:");
		String senha = s.next();
		int minCaractere = senha.length();

		// Verificando a quantidade de caracteres
		if (senha.length() < 6) {
			System.out.println("A senha deve conter no m�nimo 6 d�gitos. Por favor, digite mais " + (6 - minCaractere)
					+ " caracteres.");
		} else {
			System.out.println("OK! A senha possui a quantidade m�nima de caracteres.");

		}

		

	}

}
