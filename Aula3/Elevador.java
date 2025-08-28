import java.util.Scanner;

public class Elevador {
	private int andarAtual = 0;
	private int capacidadeMaxima = 6;
	private int quantidadePessoas = 0;
	private int totalAndares = 10;
	
	public void entrar() {
		if(quantidadePessoas < capacidadeMaxima) {
			quantidadePessoas++;
		}else {
			System.out.println("O Elevador já está cheio!");
		}
	}
		
	public void sair() {
		if(quantidadePessoas > 0) {
			quantidadePessoas--;
		}else {
			System.out.println("Não há mais ninguém no elevador");
		}
	}	
	
	public void subir() {
		if(andarAtual < totalAndares) {
			andarAtual++;
		}else {
			System.out.println("Você já está no andar máximo");
		}
	}
	
	public void descer() {
		if(andarAtual > 0) {
			andarAtual--;
		}else {
			System.out.println("Você já está no térreo");
		}
	}
	
	public void printarEstadoAtual() {
		System.out.println("-- Você esta no andar " + this.andarAtual + ".");
		System.out.println("-- Carga atual: " + this.quantidadePessoas + " pessoa(s).\n");
		}
	
	public static void main(String[] args) {
		Elevador elevador = new Elevador(); //Cria um objeto elevador na classe elevador
		Scanner sc = new Scanner(System.in); // cria um metodo que escaneia
		String opcao; // define essa string para depois usar no switch
		
		
		do {
			String mensagem = "Escolha entre: Entrar, Sair, Subir, Descer (ou Finalizar):";
			System.out.println(mensagem);
			opcao = sc.nextLine().toLowerCase();
			
			switch (opcao) {
			case "entrar":
				elevador.entrar();
				break;
			case "sair":
				elevador.sair();
				break;
			case "subir":
				elevador.subir();
				break;
			case "descer":
				elevador.descer();
				break;
			case "finalizar":
				System.out.println("...");
				break;
			default: 
				System.out.println(mensagem);
				break;
			}
			
			elevador.printarEstadoAtual();
		} while (!opcao.equals("finalizar"));
		
		sc.close();
		
	}	
}
