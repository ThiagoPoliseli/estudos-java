package Fase1.Abstracao;

import java.util.List;

public class MainAbstracao {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Gerente("Ana", 8000),
                new Vendedor("Bruno", 2500, 20000)
        );

        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s | salário: R$ %.2f%n",
                    funcionario.getNome(), funcionario.calcularSalario());
        }

        // Funcionario funcionario = new Funcionario("Carlos");

        System.out.println("--- Exercício 2.1: Formas ---");
        List<Forma> formas = List.of(new Circulo(2), new Retangulo(3, 4));
        for (Forma forma : formas) {
            forma.imprimirArea();
        }
    }
}
