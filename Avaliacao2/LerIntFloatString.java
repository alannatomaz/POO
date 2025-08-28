import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo1 {
    public static void main(String[] args) {
        
        System.out.println(" Insira um inteiro, um número de ponto flutuante e um nome composto: ");
        Scanner scanner = new Scanner (System.in);
        String entradaUsuario = scanner.nextLine(); 
       
        
        String[] entradaUsuarioArray = entradaUsuario.split("\t");
        System.out.println(Arrays.toString(entradaUsuarioArray));
        
        
        int inteiro = Integer.valueOf(entradaUsuarioArray[0]);
        float flutuante = Float.valueOf(entradaUsuarioArray[1]);
        String nome = String.valueOf(entradaUsuarioArray[2]);
        
        
        
        System.out.println("O inteiro digitado foi: " + inteiro);
        System.out.println("O float digitado foi: " + flutuante);
        System.out.println("O nome digitado foi: " + nome);

        
    }
}
