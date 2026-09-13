package Fase3.MVC;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ClienteRepository {
    private final Map<Long, Cliente> clientes = new LinkedHashMap<>();
    private long proximoId = 1;

    public Cliente salvar(Cliente cliente) {
        if (cliente.getId() == null) {
            cliente.setId(proximoId++);
        }
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes.values());
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return Optional.ofNullable(clientes.get(id));
    }
}
