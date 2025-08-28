import java.util.Scanner;

public class OcorrUltimaVogal {
  
public static void main(String[] args) {
  System.out.println("Insira uma string: ");
  
  Scanner scanner = new Scanner(System.in);
  
  String ultimaVogal = scanner.nextLine();
  
  int posicao = -1;
  
    for (int i = 0; i < ultimaVogal.length(); i++) {
    char c = ultimaVogal.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      posicao = i;
      }
    }
      if (posicao == -1) {
      System.out.println("Vogal não encontrada!");
      } else {
      System.out.println("Índice da última ocorrência de vogal: " + posicao);
      }
}
}
