package Fase3.MVC;

public class CadastroProgramado {
    private final ClienteService service;

    public CadastroProgramado(ClienteService service) {
        this.service = service;
    }

    public Cliente executar(String nome, int idade) {
        return service.cadastrar(new Cliente(nome, idade));
    }
}
