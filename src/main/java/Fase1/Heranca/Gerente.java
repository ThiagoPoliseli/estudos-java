package Fase1.Heranca;

public class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 8000;
    }
}
