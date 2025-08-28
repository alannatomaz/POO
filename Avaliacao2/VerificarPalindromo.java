import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class VerificarPalindromo {
  
public static void main(String[] args) {
  System.out.println("Insira uma string: ");
  Scanner scanner = new Scanner(System.in);
  
  String texto = scanner.nextLine();
  texto = texto.toLowerCase();
  
  System.out.println("Depois do toLowerCase: " + texto);
  
  texto = texto.replaceAll("[^a-zA-Z0-9]", "");
  
  System.out.println("Depois do replaceAll: " + texto);
  
  texto = removerAcentos(texto);
  
  System.out.println("Depois do removerAcentos: " + texto);
  
  char[] textoArray = texto.toCharArray();
    System.out.println(Arrays.toString(textoArray));
  
  boolean palindromo = true;
    for (int i = 0, j = textoArray.length - 1; i <= j; i++, j--) {
      char inicio = textoArray[i];
      char fim = textoArray[j];
      
      if (inicio != fim) {
        palindromo = false;
      break;
      }
    }
      if (palindromo == true) {
        System.out.println("É um palíndromo: " + texto);
      } else {
        System.out.println("Não é palíndromo");
        }
  }
  
  public static String removerAcentos(String input) {
    if (input == null) {
      return null;
    }
    
  return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
  }
}
