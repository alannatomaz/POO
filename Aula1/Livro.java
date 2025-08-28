public class Livro {
  String titulo;
  String autor;

  int ano;
  
void exibir() {
  System.out.println("titulo: " + titulo);
  System.out.println("autor: " + autor);
  System.out.println("ano: " + ano);
}
public static void main(String[] args) {
  Livro livro1 = new Livro();
    livro1.titulo = "recursao";
    livro1.autor = "blake crouch";
    livro1.ano = 2019;
  
    livro1.exibir();
}
}
