package Fase2.Maven;

import org.apache.commons.lang3.StringUtils;

/** Exemplo da dependência Commons Lang adicionada pelo Maven. */
public class Main {
    public static void main(String[] args) {
        System.out.println("Texto vazio: " + StringUtils.isBlank(""));
        System.out.println("Texto preenchido: " + StringUtils.isBlank("texto"));
    }
}
