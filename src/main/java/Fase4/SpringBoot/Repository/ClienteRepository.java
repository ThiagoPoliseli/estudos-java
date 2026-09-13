package Fase4.SpringBoot.Repository;

import Fase4.SpringBoot.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
