package Fase1.Heranca;

public class Funcionario {
    private final String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return 1000;
    }
}
