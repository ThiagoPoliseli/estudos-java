package Fase1.Heranca;

public class Vendedor extends Funcionario {
    public Vendedor(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 3500;
    }
}
