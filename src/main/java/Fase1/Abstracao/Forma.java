package Fase1.Abstracao;

public abstract class Forma {
    public abstract double calcularArea();

    public void imprimirArea() {
        System.out.printf("Área: %.2f%n", calcularArea());
    }
}
