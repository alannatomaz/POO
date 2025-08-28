import java.util.Scanner;

public class Ex4_MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o número de provas: ");
        
        int quantidade = scanner.nextInt();

        double soma = 0;

        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota da prova " + i + ": ");
            
            double nota = scanner.nextDouble();
            
            soma += nota;
        }

       
        double media = soma / quantidade;

        
        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close();
    }
}
