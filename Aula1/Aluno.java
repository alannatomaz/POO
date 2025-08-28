public class Aluno {
  String nome;
  int idade;
  String curso;
  
void apresentar() {
  System.out.println("Nome: " + nome);
  System.out.println("Idade: " + idade);
  System.out.println("Curso: " + curso);
  }
  
public static void main(String[] args) {
  Aluno aluno1 = new Aluno();
    aluno1.nome = "alanna";
    aluno1.idade = 27;
    aluno1.curso = "computacao";

  aluno1.apresentar();
  
}
}
