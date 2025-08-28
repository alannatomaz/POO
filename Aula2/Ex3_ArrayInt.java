import java.util.Scanner;

public class Ex3_ArrayInt {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        Integer[] numeros = new Integer[5]; 
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNumeros armazenados no array:");
        	for (Integer num : numeros) {
        		
        		System.out.println(num);
        }

        scanner.close();
    }
}
