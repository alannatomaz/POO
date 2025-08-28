public class Triangulo {
  double ladoA;
  double ladoB;
  double ladoC;
  
boolean formaTriangulo(){
  if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC >
  ladoA) {
    return true;
  }else {
    return false;
  }
  }
  
String obterTipo() {
  if(!formaTriangulo()){
  return null;
  }else if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
    return "Equilatero";
  }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
    return "Isosceles";
  }else {
    return "Escaleno";
  }
}
  
public static void main(String[] args) {
  Triangulo triangulo1 = new Triangulo ();
    triangulo1.ladoA = 3.0;
    triangulo1.ladoB = 3.0;
    triangulo1.ladoC = 4.0;
  
  System.out.println("Tipo do triangulo1: " +
  
  triangulo1.obterTipo());
}
}
