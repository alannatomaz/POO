import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo3 {

	public static void main(String[] args) {

		System.out.println("Insira uma string: ");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();

		char[] textoArray = texto.toCharArray();
		System.out.println(Arrays.toString(textoArray));

		for (int i = 0, j = textoArray.length - 1; i <= j; i++, j--) {
			char inicio = textoArray[i];
			char fim = textoArray[j];
			char aux = inicio;
			textoArray[i] = fim;
			textoArray[j] = aux;
		}

		System.out.println(String.valueOf(textoArray));

	}

}
