package Fase1.Abstracao;

import Fase1.Interface.Bonificavel;

public class Gerente extends Funcionario implements Bonificavel {
    private final double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
}
