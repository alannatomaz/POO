public class Retangulo {
  double comprimento;
  double largura;
  double calcularArea() {
  double totalArea = comprimento * largura;

  System.out.println("A área do retângulo é: " + totalArea);
  return totalArea;  
}
  
public static void main(String[] args) {
  Retangulo retangulo1 = new Retangulo();
  retangulo1.comprimento = 2.0;
  retangulo1.largura = 3.0;
  
  retangulo1.calcularArea();

}
}
