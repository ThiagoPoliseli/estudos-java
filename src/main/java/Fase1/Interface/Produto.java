package Fase1.Interface;

public class Produto implements Descontavel, Taxavel, Auditavel {
    private double preco;

    public Produto(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("O desconto deve estar entre 0 e 100.");
        }
        preco -= preco * percentual / 100;
        return preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.12;
    }
}
