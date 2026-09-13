package Fase1.Interface;

public interface Auditavel {
    default void gerarLogAuditoria() {
        System.out.println("Produto auditado");
    }
}
