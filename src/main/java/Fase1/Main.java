package Fase1;

import Fase1.Abstracao.Funcionario;
import Fase1.Abstracao.Gerente;
import Fase1.Abstracao.Vendedor;
import Fase1.Interface.Produto;
import Fase1.Sobrecarga.Calculadora;
import Fase1.Sobrecarga.Validador;

import java.util.List;

/** Ponto de entrada que demonstra todos os pacotes da Fase 1. */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Fase 1 - Orientação a Objetos ===");

        List<Funcionario> funcionarios = List.of(
                new Gerente("Ana", 8000),
                new Vendedor("Bruno", 2500, 20000)
        );

        System.out.println("\n--- Abstração, herança e sobrescrição ---");
        for (Funcionario funcionario : funcionarios) {
            exibirResumo(funcionario);
            exibirResumo(funcionario, true);
        }

        System.out.println("\n--- Interfaces ---");
        Produto produto = new Produto(100);
        System.out.printf("Preço com desconto: R$ %.2f%n", produto.aplicarDesconto(10));
        System.out.printf("Imposto: R$ %.2f%n", produto.calcularImposto());
        produto.gerarLogAuditoria();

        System.out.println("\n--- Sobrecarga ---");
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma de inteiros: " + calculadora.somar(2, 3));
        System.out.println("Soma de decimais: " + calculadora.somar(2.5, 3.5));
        System.out.println("Soma de três inteiros: " + calculadora.somar(1, 2, 3));

        Validador validador = new Validador();
        System.out.println("Texto válido: " + validador.validar("Java"));
        System.out.println("Número válido: " + validador.validar(10));
        System.out.println("Texto com tamanho mínimo: " + validador.validar("Orientação", 5));
    }

    public static void exibirResumo(Funcionario funcionario) {
        System.out.printf("%s | salário: R$ %.2f%n",
                funcionario.getNome(), funcionario.calcularSalario());
    }

    public static void exibirResumo(Funcionario funcionario, boolean incluirBonusAnual) {
        exibirResumo(funcionario);
        if (incluirBonusAnual && funcionario instanceof Fase1.Interface.Bonificavel bonificavel) {
            System.out.printf("Bônus anual: R$ %.2f%n", bonificavel.calcularBonusAnual());
        }
    }
}
