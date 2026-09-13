package Fase1.Sobrescricao;

import Fase1.Abstracao.Funcionario;
import Fase1.Abstracao.Gerente;
import Fase1.Abstracao.Vendedor;

import java.util.List;

public class MainSobrescricao {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Gerente("Ana", 8000),
                new Vendedor("Bruno", 2500, 20000)
        );

        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s: R$ %.2f%n",
                    funcionario.getNome(), funcionario.calcularSalario());
        }
    }
}
