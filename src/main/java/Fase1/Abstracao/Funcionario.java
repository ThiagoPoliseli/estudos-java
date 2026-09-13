package Fase1.Abstracao;

public abstract class Funcionario {
    private final String nome;

    protected Funcionario(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ficar vazio.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario();
    public double calcularBonus() {
        return 0;
    }
}
