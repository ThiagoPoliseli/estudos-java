package Fase1.Interface;

public class MainInterface {
    public static void main(String[] args) {
        Produto produto = new Produto(100);
        System.out.printf("Preço com desconto: R$ %.2f%n", produto.aplicarDesconto(10));
        System.out.printf("Imposto: R$ %.2f%n", produto.calcularImposto());
        produto.gerarLogAuditoria();
    }
}
