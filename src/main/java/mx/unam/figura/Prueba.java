package mx.unam.figura;

/**
 *
 * @author HP
 */
public class Prueba {
   public static void main(String[] args) {
        System.out.println("Hello World!");
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4, 7);
        Cuadrado cuadrado = new Cuadrado(3);
        Triangulo triangulo = new Triangulo(3, 4);

        System.out.println("Círculo: Área = " + circulo.calcularArea() + 
                           ", Perímetro = " + circulo.calcularPerimetro());

        System.out.println("Rectángulo: Área = " + rectangulo.calcularArea() + 
                           ", Perímetro = " + rectangulo.calcularPerimetro());

        System.out.println("Cuadrado: Área = " + cuadrado.calcularArea() + 
                           ", Perímetro = " + cuadrado.calcularPerimetro());

        System.out.println("Triángulo: Área = " + triangulo.calcularArea() + 
                           ", Perímetro = " + triangulo.calcularPerimetro());
    }
}
