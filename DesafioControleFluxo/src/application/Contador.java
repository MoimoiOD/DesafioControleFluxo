package application;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		try {
			System.out.print("Digite o primeiro valor: ");
			Integer num1 = sc.nextInt();
			System.out.print("Digite o segundo valor: ");
			Integer num2 = sc.nextInt();
			
			imprimirValores(num1, num2);

		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

	public static void imprimirValores(Integer num1, Integer num2) throws ParametrosInvalidosException {
		if (num1 > num2) {
			throw new ParametrosInvalidosException("Erro: Primeiro parâmetro é maior do que o segundo.");
		} else {
			for (Integer i = num1; i <= num2; i++) {
				System.out.println(num1);
				num1++;
			}

		}
	}

}
