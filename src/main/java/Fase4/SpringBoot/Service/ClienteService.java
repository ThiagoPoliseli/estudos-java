package Fase4.SpringBoot.Service;

import Fase4.SpringBoot.Model.Cliente;
import Fase4.SpringBoot.Repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente cadastrar(Cliente cliente) {
        validar(cliente);
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    private void validar(Cliente cliente) {
        if (cliente == null || cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }
        if (cliente.getIdade() < 18) {
            throw new IllegalArgumentException("O cliente precisa ter pelo menos 18 anos.");
        }
    }
}
