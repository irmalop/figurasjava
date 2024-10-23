package mx.unam.figura;

/**
 *
 * @author HP
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Asumiendo un triángulo equilátero para simplificar
        return 3 * base;
    }
}

