package Fase0;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
