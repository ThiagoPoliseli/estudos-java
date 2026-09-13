package Fase1.Heranca;

import java.util.List;

public class MainHeranca {
    public static void main(String[] args) {
        System.out.println("--- Herança com Animal ---");
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();

        System.out.println("--- Exercício 1.1: Funcionários ---");
        List<Funcionario> funcionarios = List.of(
                new Gerente("Ana"),
                new Vendedor("Bruno")
        );

        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s | salário: R$ %.2f%n",
                    funcionario.getNome(), funcionario.calcularSalario());
        }
    }
}
