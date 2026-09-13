package Fase1.Interface;

public interface Bonificavel {
    double calcularBonus();

    default double calcularBonusAnual() {
        return calcularBonus() * 12;
    }
}
