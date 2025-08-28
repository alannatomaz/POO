/* Exercicio 2: Escreva um programa que pegue dois numeros inteiros como entrada e 
 * permita ao usuario escolher uma das quatro operações basicas(soma, subtração, multiplicação ou divisão.
 * Realize a operação escolhida e imprima o resultado*/

import java.util.Scanner;

public class Ex2_CalcSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int numero1 = scanner.nextInt();

		System.out.println("Insira um numero: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Escolha entre as operações: \n1- Soma \n2- Subtração \n3- Multiplicacao \n4- Divisao");
		
		int operacao = scanner.nextInt();
		
		switch (operacao) {
        case 1:
            System.out.println("Resultado: " + (numero1 + numero2));
            break;
        case 2:
            System.out.println("Resultado: " + (numero1 - numero2));
            break;
        case 3:
            System.out.println("Resultado: " + (numero1 * numero2));
            break;
        case 4: 
        	System.out.println("Resultado: " + ((double) numero1 / numero2));
        	break;
        }
		
		scanner.close();

	}
}	
