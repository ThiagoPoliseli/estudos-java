package Fase1.Sobrecarga;

public class  Validador {
    public boolean validar(String texto) {
        return texto != null && !texto.isBlank();
    }

    public boolean validar(int numero) {
        return numero > 0;
    }

    public boolean validar(String texto, int tamanhoMinimo) {
        return validar(texto) && texto.length() >= tamanhoMinimo;
    }
}
