package Fase1.Sobrecarga;

public class MainSobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(2, 3));
        System.out.println(calculadora.somar(2.5, 3.5));
        System.out.println(calculadora.somar(1, 2, 3));

        Validador validador = new Validador();
        System.out.println(validador.validar("Java"));
        System.out.println(validador.validar(10));
        System.out.println(validador.validar("Orientação", 5));
    }
}
