import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Algoritmo senha forte: construa um algoritmo que informe qual é o número
		 * mínimo de caracteres que devem ser adicionados para uma string qualquer ser
		 * considerada segura. Características de senha forte: Possui no mínimo 6
		 * caracteres. Contém no mínimo 1 digito. Contém no mínimo 1 letra em minúsculo.
		 * Contém no mínimo 1 letra em maiúsculo. Contém no mínimo 1 caractere especial.
		 * Os caracteres especiais são: !@#$%^&*()-+
		 */

		// ABRINDO A ENTRADA PARA RECEBER O NUMERO DE DEGRAUS NO CONSOLE
		Scanner s = new Scanner(System.in);

		System.out.println("Informe uma senha forte:");
		String senha = s.next();
		int minCaractere = senha.length();

		// Verificando a quantidade de caracteres
		if (senha.length() < 6) {
			System.out.println("A senha deve conter no mínimo 6 dígitos. Por favor, digite mais " + (6 - minCaractere)
					+ " caracteres.");
		} else {
			System.out.println("OK! A senha possui a quantidade mínima de caracteres.");

		}

		

	}

}
