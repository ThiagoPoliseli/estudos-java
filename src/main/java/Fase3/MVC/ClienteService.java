package Fase3.MVC;

import java.util.List;

public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente cadastrar(Cliente cliente) {
        validar(cliente);
        return repository.salvar(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.listarTodos();
    }

    public Cliente buscarPorId(Long id) {
        return repository.buscarPorId(id).orElse(null);
    }

    private void validar(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente obrigatório.");
        }
        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }
        if (cliente.getIdade() < 18) {
            throw new IllegalArgumentException("O cliente precisa ter pelo menos 18 anos.");
        }
    }
}
