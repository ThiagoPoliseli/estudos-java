package Fase5.Lombok;

import Fase5.Lombok.Model.Cliente;
import Fase5.Lombok.Model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MainLombok {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", 25);

        Pedido pedido = Pedido.builder()
                .descricao("Curso de Java")
                .valor(new BigDecimal("199.90"))
                .dataCriacao(LocalDateTime.now())
                .cliente(cliente)
                .build();

        cliente.getPedidos().add(pedido);
        System.out.println(cliente);
        System.out.println(pedido);
    }
}
