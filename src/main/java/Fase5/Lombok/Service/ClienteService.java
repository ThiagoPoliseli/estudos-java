package Fase5.Lombok.Service;

import Fase5.Lombok.Model.Cliente;
import Fase5.Lombok.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    public Cliente cadastrar(Cliente cliente) {
        if (cliente == null || cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }
        if (cliente.getIdade() < 18) {
            throw new IllegalArgumentException("O cliente precisa ter pelo menos 18 anos.");
        }
        return repository.save(cliente);
    }
}
