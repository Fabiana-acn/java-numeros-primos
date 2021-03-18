import java.util.Locale;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// formata��o de decimais
		Scanner sc = new Scanner(System.in);// Para fazer entrada de dados,

		// S�o considerados n�meros primos os termos num�ricos maiores que 1, divis�veis
		// por 1 e por ele mesmo.

		int numero = 0;

		numero = sc.nextInt(); // vai ler a var numero
		System.out.println("Os numeros primos s�o: ");
		// System.out.println(numero);

		// for variavel de intera��o ,condi�ao de parada , incrementa
		for (int numeroPrimo = 2; numeroPrimo <= numero; numeroPrimo++) {

			boolean primo = true;

			for (int antecessor = numeroPrimo - 1; antecessor > 1; antecessor--) {
				if (((numeroPrimo % antecessor) == 0)) {
					primo = false;
					break;
				}
			}

			if (primo) {
				System.out.println("O numero:" + numeroPrimo + " é primo");
			}

		}

		sc.close();
	}
};
