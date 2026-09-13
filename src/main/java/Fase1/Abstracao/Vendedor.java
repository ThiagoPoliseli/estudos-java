package Fase1.Abstracao;

import Fase1.Interface.Bonificavel;

public class Vendedor extends Funcionario implements Bonificavel {
    private final double salarioBase;
    private final double totalVendas;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome);
        if (salarioBase < 0 || totalVendas < 0) {
            throw new IllegalArgumentException("Salário e vendas não podem ser negativos.");
        }
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + totalVendas * 0.05;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.02;
    }
}
