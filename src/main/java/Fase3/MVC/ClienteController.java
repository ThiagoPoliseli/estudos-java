package Fase3.MVC;

import java.util.List;

public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    public Cliente cadastrar(String nome, int idade) {
        return service.cadastrar(new Cliente(nome, idade));
    }

    public List<Cliente> listarTodos() {
        return service.listarTodos();
    }

    public Cliente buscarPorId(Long id) {
        return service.buscarPorId(id);
    }
}
